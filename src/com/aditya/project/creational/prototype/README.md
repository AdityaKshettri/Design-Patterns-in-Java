# Prototype

Prototype is a creational design pattern that allows cloning objects, even complex ones, without coupling to their
specific classes.

All prototype classes should have a common interface that makes it possible to copy objects even if their concrete
classes are unknown. Prototype objects can produce full copies since objects of the same class can access each other’s
private fields.

Prototype Registry provides an easy way to access frequently-used prototypes. It stores a set of pre-built objects that
are ready to be copied.

*Hint: abstract clone()*

Reference: https://refactoring.guru/design-patterns/prototype