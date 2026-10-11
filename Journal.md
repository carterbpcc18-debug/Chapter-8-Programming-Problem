# Cyber-Dex Assignment Journal

## Phase 1: The Base Code

**Journal Prompt:** What happens if you try to write
new DigitalMonster() in your main method, and why does
Java prevent this?

**Response:**

Java does not allow me to create an object directly
from DigitalMonster because it is an abstract class.
An abstract class can provide common fields and methods
for its subclasses, but it is not meant to be instantiated
on its own.

DigitalMonster also has an abstract performAttack()
method, which does not have an implementation in the
parent class. The concrete subclasses, FlameMonster
and AquaMonster, provide their own implementations
of this method.

This allows each monster to have its own attack while
sharing common information such as its name, level,
and element.

**Testing:** I will compile and run the program to
confirm that both monsters display their attack messages.


## Phase 2: Special Ability Modules

**Journal Prompt:** Why is it more flexible to use an
interface for an ability like Flyable rather than putting
a fly() method in the DigitalMonster base class?

**Response:**

Using an interface is more flexible because not every
monster needs to have the same abilities. If fly() were
included in DigitalMonster, every monster would inherit
a flying method even if it could not fly.

The Flyable interface allows only monsters that can fly
to implement that ability. The Electric interface works
the same way for monsters that can use electricity.

StormBird implements both interfaces, so it can attack,
fly, and use electricity. This keeps the abilities
separate from the common properties of all monsters.

**Testing:** I will compile and run the program to
verify StormBird's attack, flying, and electric abilities.


## Phase 3: The Cyber-Dex Catalog

**Journal Prompt:** Explain how polymorphism allows you
to store different types of monsters (Flame, Aqua, Storm,
etc.) in a single ArrayList. Why is this better than
creating separate lists for every single monster species?

**Response:**

Polymorphism allows different monster classes to be
stored in the same ArrayList because they all extend
DigitalMonster. Even though each monster has its own
attack implementation, I can refer to each one using
the DigitalMonster type.

The for-each loop calls performAttack() on every monster,
and Java executes the implementation belonging to that
monster's actual class.

This is more convenient than creating separate lists
for every species because the catalog can manage all
monsters in one collection. It also makes it easier to
add new monster types without changing the basic loop.

**Testing:** I will compile and run the program to
confirm that all four monsters appear in the catalog
and perform their own attacks.


## Phase 4: The Ability Scanner

**Journal Prompt:** How does the instanceof operator
help you handle interfaces in a polymorphic list?
Describe a scenario where this would be useful in a
real game (e.g., a flying-only zone).

**Response:**

The instanceof operator checks whether an object
implements a particular interface. Since my ArrayList
contains DigitalMonster objects of different subclasses,
not every monster has the Flyable ability.

Using instanceof allows the scanner to identify
monsters that implement Flyable before calling fly().
The cast lets me access the interface method through
the DigitalMonster reference.

In a real game, this could be useful in a flying-only
zone. The game could check whether a character can fly
before allowing it to enter the area. Monsters without
the Flyable ability would not qualify.

**Testing:** I will compile and run the program to
verify that Thunderwing is identified as capable of
flight and that the other monsters are not identified
by the scanner.


## Phase 5: Validation & Reflection

**Journal Prompt:** What bugs or edge cases did you
discover during testing? If you consulted an LLM, what
feedback did it provide, and did you choose to apply
any of it? Explain your reasoning.

**Response:**

During testing, I checked that each monster performed
its correct attack and that the ability scanner only
identified monsters that implemented Flyable.

I also checked that the abstract DigitalMonster class
could not be instantiated directly. This helped me
understand why abstract classes are useful when
different subclasses need to provide their own behavior.

One important edge case is that a monster can be stored
as a DigitalMonster reference without necessarily
having every possible ability. The instanceof check
helps prevent the program from trying to use the fly()
method on a monster that does not implement Flyable.

I also reviewed the program's structure to make sure
that common monster information was stored in the
base class and that special abilities were defined
using interfaces.

**Final Testing:** After completing the tests, I will
confirm that the program compiles and produces the
expected output before submitting the assignment.