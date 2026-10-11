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