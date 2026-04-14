# C2: Design Pattern Justification Document

## 1. Selected Design Pattern
[cite_start]The selected pattern for the PC Customization System is the **Builder Design Pattern**, which falls under the category of Creational Design Patterns[cite: 12].

## 2. Why it Fits the Identified Problem
The Builder pattern is **highly suitable** for this scenario because:
* [cite_start]**Handles Complexity:** A PC is a complex object with a mix of mandatory parts and numerous optional components[cite: 22].
* [cite_start]**Separation of Concerns:** It separates the construction process of the `PC` from its final representation[cite: 13].
* **Step-by-Step Construction:** Unlike the **Abstract Factory** pattern, which focuses on creating families of related objects, the Builder pattern is more suitable here because it focuses on constructing a single complex object step-by-step.

## 3. Reasoning Based on Design Principles
[cite_start]The selection of the Builder pattern is strongly supported by core design principles[cite: 14]:

### A. Single Responsibility Principle (SRP)
Without the Builder pattern, the `PC` class would handle both its data and assembly logic. [cite_start]By applying this pattern, the `PC` class only holds data, while `PCBuilder` classes handle the assembly[cite: 15].

### B. Open/Closed Principle (OCP)
The system is open for extension but closed for modification. New types of computers (e.g., `ServerPC`) can be added by creating new Concrete Builder classes without modifying existing code.

### C. Encapsulation
The client code does not need to know the intricate details of how a PC is assembled. The client simply interacts with the `PCDirector` to get the final product.

## 4. Architectural Alignment
[cite_start]This design is reflected in the **UML diagram** [cite: 17][cite_start], where the `PCDirector` orchestrates the construction process using different implementations of the `PCBuilder` interface[cite: 18].
### C. Encapsulation
The client code (e.g., the `Main` execution class) does not need to know the intricate details of how a GPU is installed or how the motherboard is wired. The client simply asks the `PCDirector` to build a PC using a specific builder, completely encapsulating the complex assembly process.
