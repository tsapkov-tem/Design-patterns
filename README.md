# Design-patterns
## All main patterns
Here are very basic examples of OOP Design Patterns. They are mainly compiled for myself to refer back to but feel free to take a look.
## Creational Design Patterns
Creational design patterns provide solutions to instantiate an `Object` in the best possible way for specific situations.
### 1. Singleton Pattern
The singleton pattern restricts the instantiation of a Class and ensures that only one instance of the `class` exists in the Java Virtual Machine

### 2. Abstract Factory Pattern
The abstract factory pattern is similar to the factory pattern and is a factory of factories.

### 3. Builder Pattern
The builder pattern was introduced to solve some of the problems with factory and abstract Factory design patterns when the object contains a lot of attributes. This pattern solves the issue with a large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final `Object`.

### 4. Prototype Pattern
The prototype pattern is used when the `Object` creation is costly and requires a lot of time and resources, and you have a similar `Object` already existing. So this pattern provides a mechanism to copy the original `Object` to a new `Object` and then modify it according to our needs.

## Structural Design Patterns
Structural design patterns provide different ways to create a `Class` structure (for example, using inheritance and composition to create a large `Object` from small `Object`s).

### 1. Adapter Pattern
The adapter design pattern is one of the structural design patterns and is used so that two unrelated interfaces can work together. The object that joins these unrelated interfaces is called an adapter.

### 2. Composite Pattern
The composite pattern is used when we have to represent a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure have to be treated the same way, we can apply the composite design pattern.

### 3. Proxy Pattern
The proxy pattern provides a placeholder for another `Object` to control access to it. This pattern is used when we want to provide controlled access to functionality.

### 4. Flyweight Pattern
The flyweight design pattern is used when we need to create a lot of `Object`s of a `Class`. Since every `Object` consumes memory space that can be crucial for low-memory devices (such as mobile devices or embedded systems), the flyweight design pattern can be applied to reduce the load on memory by sharing `Object`s.

### 5. Facade Pattern
The facade pattern is used to help client applications easily interact with the system.

### 6. Bridge Pattern
When we have interface hierarchies in both interfaces as well as implementations, then the bridge design pattern is used to decouple the interfaces from the implementation and to hide the implementation details from the client programs. The implementation of the bridge design pattern follows the notion of preferring composition over inheritance.

### 7. Decorator Pattern
The decorator design pattern is used to modify the functionality of an object at runtime. At the same time, other instances of the same class will not be affected by this, so the individual object gets the modified behavior.

## Behavioral Design Patterns
Behavioral patterns provide a solution for better interaction between objects and how to provide loose-coupling and flexibility to extend easily.

### 1. Template Method Pattern
The template method pattern is a behavioral design pattern and is used to create a method stub and to defer some of the steps of implementation to the subclasses. The template method defines the steps to execute an algorithm, and it can provide a default implementation that might be common for all or some of the subclasses.

### 2. Mediator Pattern
The mediator design pattern is used to provide a centralized communication medium between different objects in a system. If the objects interact with each other directly, the system components are tightly-coupled with each other which makes maintainability cost higher and not flexible to extend easily. The mediator pattern focuses on providing a mediator between objects for communication and implementing loose-coupling between objects. The mediator works as a router between objects, and it can have its own logic to provide a way of communication.

### 3. Chain of Responsibility Pattern
The chain of responsibility pattern is used to achieve loose-coupling in software design where a request from the client is passed to a chain of objects to process them. Then the object in the chain will decide who will be processing the request and whether the request is required to be sent to the next object in the chain or not.

### 4. Observer Pattern
An observer design pattern is useful when you are interested in the state of an Object and want to get notified whenever there is any change. In the observer pattern, the Object that watches the state of another Object is called observer, and the Object that is being watched is called subject.

### 5. Strategy Pattern
Strategy pattern is used when we have multiple algorithms for a specific task, and the client decides the actual implementation be used at runtime.

### 6. Command Pattern
The command pattern is used to implement loose-coupling in a request-response model. In this pattern, the request is sent to the invoker and the invoker passes it to the encapsulated command object. The command object passes the request to the appropriate method of receiver to perform the specific action.

### 7. State Pattern
The state design pattern is used when an `Object` changes its behavior based on its internal state. If we have to change the behavior of an `Object` based on its state, we can have a state variable in the `Object` and use `if-else` condition block to perform different actions based on the state. The state pattern is used to provide a systematic and loosely-coupled way to achieve this through context and state implementations.

### 8. Visitor Pattern
The visitor pattern is used when we have to perform an operation on a group of similar kinds of objects. With the help of a visitor pattern, we can move the operational logic from the objects to another class.

### 9. Iterator Pattern
The iterator pattern is one of the behavioral patterns and is used to provide a standard way to traverse through a group of objects.

### 10. Memento Pattern
The memento design pattern is used when we want to save the state of an object so that we can restore it later on. This pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the `Object`, this protects the integrity of saved state data.
