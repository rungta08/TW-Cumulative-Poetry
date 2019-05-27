# Cumulative Poetry

We are building a product that will be used in poetry classes. We target a poetry of a form called as cumulative poetry. The functionality is broken down into releases.

## Release 1

**Business needs**

Cumulative poetry shows itself little by little. It’s much like unfolding a tale. The one taught in the class goes like - 

+ Day 1 
```
This is the house that Jack built.
```

+ Day 2
```
This is the malt that lay in
    the house that Jack built.
```

+ Day 3 
```
This is the rat that ate
    the malt that lay in
    the house that Jack built.
```

And so on, as you see the tale is unfolded little by little every day. The whole tale is unfolded on,

+ Day 12
```
This is the horse and the hound and the horn that belonged to
    the farmer sowing his corn that kept
    the rooster that crowed in the morn that woke
    the priest all shaven and shorn that married
    the man all tattered and torn that kissed
    the maiden all forlorn that milked 
    that cow with the crumpled horn that tossed
    the dog that worried 
    the cat that killed
    the rat that ate
    the malth that lay in 
    the house that Jack built.
```
___

**Steps To Generate Jar**

1. Clone this GitHub Repository on your Eclipse.
2. Right Click on Project Folder -> Click on Export -> Click on Runnable Jar -> Select options and then Click on Finish.
2. There should be a created jar that supports above mentioned functionality, with the following behaviour:

Flags supported 
- `--reveal-for-day for_which_day` : Reveals the tale up till that day
- `--recite` : Recites the whole tale with a day wise breakage

Example usage: 

`$ java -jar CumulativePoetry.jar --reveal-for-day 1`
```
This is the house that Jack built.
```

`$ java -jar CumulativePoetry.jar --reveal-for-day 2`
```
This is the malt that lay in
    the house that Jack built.
```

`$ java -jar CumulativePoetry.jar --recite`
```
Day 1 - 
This is the house that Jack built.

Day 2 - 
This is the malt that lay in
    the house that Jack built.

... // There will be a tale for everyday
...

Day 12 - 
This is the horse and the hound and the horn that belonged to
    the farmer sowing his corn that kept
    the rooster that crowed in the morn that woke
    the priest all shaven and shorn that married
    the man all tattered and torn that kissed
    the maiden all forlorn that milked 
    that cow with the crumpled horn that tossed
    the dog that worried 
    the cat that killed
    the rat that ate
    the malth that lay in 
    the house that Jack built.   
```


## Release 2


The poetry class wants each line to echo twice, if the flag is specified. Else retain the default behaviour. The purpose is that the poetry starts reading more like a song.

**Technical Specification**

1. Support the new flags as shown below

Flags supported 
- `--reveal-for-day for_which_day [--echo]` : Reveals the tale up till that day, with an optional echo
- `--recite [--echo]` : Recites the whole tale with a day with an optional echo

Example usage: 

`$ java -jar CumulativePoetry.jar --reveal-for-day 1`
```
This is the house that Jack built.
```

`$ java -jar CumulativePoetry.jar --echo --reveal-for-day 1`
```
This is the house that Jack built
    the house that Jack built.
```

`$ java -jar CumulativePoetry.jar --echo --reveal-for-day 2`
```
This is the malth that lay in
    the malth that lay in
    the house that Jack built
    the house that Jack built.
```

`$ java -jar CumulativePoetry.jar --echo --recite`
```
Day 1 - 
This is the house that Jack built
    the house that Jack built.

Day 2 - 
This is the malth that lay in
    the malth that lay in
    the house that Jack built
    the house that Jack built.

... // There will be a tale for everyday
...

Day 12 - 
This is the horse and the hound and the horn that belonged to
    the horse and the hound and the horn that belonged to
    the farmer sowing his corn that kept
    the farmer sowing his corn that kept
    the rooster that crowed in the morn that woke
    the rooster that crowed in the morn that woke
    the priest all shaven and shorn that married
    the priest all shaven and shorn that married
    the man all tattered and torn that kissed
    the man all tattered and torn that kissed
    the maiden all forlorn that milked 
    the maiden all forlorn that milked 
    that cow with the crumpled horn that tossed
    that cow with the crumpled horn that tossed
    the dog that worried 
    the dog that worried 
    the cat that killed
    the cat that killed
    the rat that ate
    the rat that ate
    the malth that lay in 
    the malth that lay in 
    the house that Jack built.
    the house that Jack built.
```
2. As mentioned previously, all code is unit tested. Maintained in source control with small commits.


## Release 3

The poetry class want to experiement with randomly generated poetry. The tale always end with **the house that Jack built.**

**Technical specifications**

1. Support the new flags as shown below

Flags supported 
- `--reveal-for-day for_which_day [--random] [--seed seed_value] [--echo]` : Reveals the tale up till that day, optionally in a random order with an optional echo or both, as specified
- `--recite [--random] [--seed seed_value] [--echo]` : Recites the whole tale with a day wise breakage, optionally in a random order with an optional echo or both, as specified

Example usage: (*Note seed values are just examples, your results might differ*)

`$ java -jar poetry-class.jar --reveal-for-day 2`
```
This is the malt that lay in
    the house that Jack built.
```

`$ java -jar poetry-class.jar --reveal-for-day 2 --random`
```
Seed used - 123 
This is the man all tattered and torn that kissed
    the house that Jack built.
```

`$ java -jar poetry-class.jar --reveal-for-day 2 --random --seed 10`
```
Seed used - 10 
This is the dog that worried 
    the house that Jack built.
```

As mentioned, using the seed agai, produces the same result:

`$ java -jar poetry-class.jar --reveal-for-day 2 --random --seed 123`
```
Seed used - 123 
This is the the man all tattered and torn that kissed
    the house that Jack built.
```

Also, recitation follows similar pattern:

`$ java -jar poetry-class.jar --recite --random --seed 123`
```
Seed used - 123
Day 1 - 
This is the house that Jack built.

Day 2 - 
This is the man all tattered and torn that kissed
    the house that Jack built.

... // There will be a tale for everyday
...

Day 12 - 
This is 
    the farmer sowing his corn that kept
    the horse and the hound and the horn that belonged to
    the priest all shaven and shorn that married
    the malth that lay in
    the maiden all forlorn that milked 
    that cow with the crumpled horn that tossed
    the rooster that crowed in the morn that woke
    the dog that worried 
    the rat that ate
    the cat that killed
    the man all tattered and torn that kissed 
    the house that Jack built.
```

Both echo and random - 

`$ java -jar poetry-class.jar --echo --reveal-for-day 2 --random --seed 10`
```
Seed used - 10
This is the dog that worried 
    the dog that worried
    the house that Jack built
    the house that Jack built.
```

`$ java -jar poetry-class.jar --echo --recite --random --seed 123`
```
Seed used - 123
Day 1 - 
This is the house that Jack built
    the house that Jack built.

Day 2 - 
This is the man all tattered and torn that kissed
    the man all tattered and torn that kissed
    the house that Jack built
    the house that Jack built.

... // There will be a tale for everyday
...

Day 12 - 
This is 
    the farmer sowing his corn that kept
    the farmer sowing his corn that kept
    the horse and the hound and the horn that belonged to
    the horse and the hound and the horn that belonged to
    the priest all shaven and shorn that married
    the priest all shaven and shorn that married
    the malth that lay in
    the malth that lay in
    the maiden all forlorn that milked 
    the maiden all forlorn that milked 
    that cow with the crumpled horn that tossed
    that cow with the crumpled horn that tossed
    the rooster that crowed in the morn that woke
    the rooster that crowed in the morn that woke
    the dog that worried 
    the dog that worried 
    the rat that ate
    the rat that ate
    the cat that killed
    the cat that killed
    the man all tattered and torn that kissed 
    the man all tattered and torn that kissed 
    the house that Jack built
    the house that Jack built.
```

2. As mentioned previously, all code is unit tested. Maintained in source control with small commits.



