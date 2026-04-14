# C2: Problem Analysis & Trade-off Report

## 1. The Real-World Software Problem
In the context of an e-commerce platform for customizing Personal Computers (PCs), the system must handle the creation of highly configurable `PC` objects. A standard PC consists of several components:
* **Mandatory Components:** CPU, Motherboard, Power Supply.
* **Optional Components:** Dedicated GPU, Liquid Cooling System, extra RAM modules, secondary Storage (SSD/HDD), and RGB lighting.

## 2. Design Challenges
The primary challenge is managing the instantiation of the `PC` object given the vast number of optional configurations. 

If a standard class constructor is used, it leads to the **Telescoping Constructor Anti-Pattern**. The developer is forced to create numerous overloaded constructors (e.g., one for just CPU/Motherboard, another adding a GPU, another adding Cooling, etc.). Alternatively, using a single constructor with all possible parameters results in code that is:
* **Unreadable:** `new PC("Intel i9", "Asus", "Corsair 850W", "RTX 4090", null, "32GB", null);`
* **Error-Prone:** It is extremely easy to accidentally swap string arguments (e.g., passing the RAM string into the Storage parameter).

## 3. Comparing Design Approaches (Trade-offs)
To resolve this creational complexity, we evaluate two patterns from Case 1: **Abstract Factory** and **Builder**.

### Option A: Abstract Factory
* **Purpose:** Ensures the creation of families of related or dependent objects.
* **Pros:** Excellent if the problem was strictly about compatibility (e.g., ensuring an AMD CPU is only paired with an AM5 Motherboard).
* **Cons:** It does not solve the core issue of the "step-by-step" construction of a single complex object with many optional parts. We would still face the constructor complexity issue when assembling the final PC.

### Option B: Builder Pattern (Selected)
* **Purpose:** Separates the construction of a complex object from its representation.
* **Pros:** Solves the Telescoping Constructor problem by allowing step-by-step initialization. It permits creating different representations (e.g., Office PC vs. Gaming PC) using the same construction process.
* **Cons:** Requires creating multiple classes (Product, Builder Interface, Concrete Builders, Director), which slightly increases the initial codebase complexity.

## 4. Conclusion
While the Abstract Factory ensures component compatibility, the primary design challenge here is the structural complexity of assembling a highly configurable object. Therefore, the **Builder Pattern** is the superior solution to eliminate constructor bloat and provide a clean, maintainable, and readable API for creating PC instances.
