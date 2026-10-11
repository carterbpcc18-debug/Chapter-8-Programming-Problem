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