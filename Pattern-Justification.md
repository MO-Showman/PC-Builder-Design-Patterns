# C2: Design Pattern Justification Document

## 1. Selected Design Pattern
The selected pattern for the PC Customization System is the **Builder Design Pattern**, which falls under the category of Creational Design Patterns.

## 2. Why it Fits the Identified Problem
The Builder pattern is perfectly suited for this scenario because:
* **Handles Complexity:** A PC is a complex object with a mix of mandatory parts (CPU, RAM) and numerous optional parts (Liquid Cooling, RGB, extra SSDs). The Builder pattern handles this by constructing the object step-by-step.
* **Separation of Concerns:** It separates the construction process of the `PC` from its final representation. 
* **Multiple Representations:** Using the exact same construction process (managed by the `PCDirector`), we can create entirely different representations of a PC (e.g., using `GamingPCBuilder` vs. `OfficePCBuilder`).

## 3. Reasoning Based on Design Principles
The selection of the Builder pattern is heavily supported by core object-oriented design principles:

### A. Single Responsibility Principle (SRP)
Without the Builder pattern, the `PC` class would have to contain both its data attributes and the complex logic required to assemble itself. By applying the Builder pattern, we achieve SRP:
* The `PC` class is strictly responsible for holding the final product's data.
* The `PCBuilder` classes are strictly responsible for the instantiation and assembly logic.

### B. Open/Closed Principle (OCP)
The system is open for extension but closed for modification. If the e-commerce store decides to start selling a new type of computer (e.g., a `ServerPC` or `WorkstationPC`), we simply create a new `ServerPCBuilder` class that implements the `PCBuilder` interface. We **do not** need to modify the existing `PC` class, the `PCDirector`, or the interface itself.

### C. Encapsulation
The client code (e.g., the `Main` execution class) does not need to know the intricate details of how a GPU is installed or how the motherboard is wired. The client simply asks the `PCDirector` to build a PC using a specific builder, completely encapsulating the complex assembly process.
