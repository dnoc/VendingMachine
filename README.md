#Vending Machine Kata
Instructions here: https://github.com/guyroyse/vending-machine-kata

A TDD exercise to create a Vending Machine.

Broadcasting some thoughts below.

##Accept Money
- The penny is not accepted. I can imagine a few ways to "return" it, like passing out a penny and passing either null or a "none" value, but the latter seems to mess up the Coin enum conceptually. I decided to return true or false.
- Decided I may as well split into multiple test files as this will get pretty long.
- "Identifies based on weight" strategies: (always seem trivial to me in katas but some people care)
..1. Just make an enum of coins. The machine doesn't _act_ like it knows what coin is which because getting the value is done outside of the Coin enum.
..2. Create a Coin object that just has weight/size. It gets entered, then the machine decides to make a new Currency object (Q,D,N,P) based on that.
..3. Pass in "int coinWeight" and just do a Coin constructor based on that, it gets called in the enter() method.
- I'd like to extract CoinValueMap to its own class but I'm not sure how to do that so it gets the default HashMap methods. That way would make a new constructor and leave open the possibility of passing in Denominations and having different overload methods to handle USD/EUR/GBP etc.
