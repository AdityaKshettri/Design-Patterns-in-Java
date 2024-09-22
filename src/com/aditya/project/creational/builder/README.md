# Builder

Builder is a creational design pattern, which allows constructing complex objects step by step.

Unlike other creational patterns, Builder doesn’t require products to have a common interface. That makes it possible to
produce different products using the same construction process.

Director class defines the order in which to execute the building steps, while the builder provides the implementation
for those steps. It works with a builder object through common Builder interface. Hence, it may not know which builder
is provided.

Reference: https://refactoring.guru/design-patterns/builder