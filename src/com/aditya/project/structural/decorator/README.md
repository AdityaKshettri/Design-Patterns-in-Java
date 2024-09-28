# Decorator

Decorator is a structural pattern that allows adding new behaviors to objects dynamically by placing them inside special
wrapper objects, called decorators.

Using decorators you can wrap objects countless number of times since both target objects and decorators follow the same
interface. The resulting object will get a stacking behavior of all wrappers.

*Hint:  Use when not possible (final) to extend an object’s behavior using inheritance.*

Reference: https://refactoring.guru/design-patterns/decorator