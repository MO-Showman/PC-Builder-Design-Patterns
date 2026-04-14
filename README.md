# 🖥️ PC Builder System - Design Patterns Project

## 📌 Project Overview
This project is developed as part of the **Design Patterns Course (Case 1)**. The main objective is to analyze a real-world software problem, compare design approaches, and implement a suitable design pattern. 

**Selected Pattern:** Builder Pattern (Creational)

## 🎯 The Real-World Problem
In e-commerce systems for customizing personal computers (PCs), building a `PC` object is highly complex. A PC consists of mandatory components (CPU, Motherboard, RAM) and optional components (Liquid Cooling, RGB Lighting, extra Storage). Using a standard constructor leads to the **Telescoping Constructor Anti-Pattern**, making the code hard to read, scale, and maintain.

## 🛠️ The Solution (Builder Pattern)
To solve this complexity, we implemented the **Builder Design Pattern**. It separates the construction of a complex `PC` object from its representation, allowing the same construction process to create different representations (e.g., `GamingPC`, `OfficePC`).

## 📂 Deliverables & Project Structure
This repository contains all the required deliverables for Case 1:
- **[C2] Problem Analysis & Trade-offs:** Detailed in the documentation.
- **[C2] Pattern Selection & Justification:** Explaining why Builder is better than Abstract Factory for this specific case.
- **[C2] UML Diagrams:** Visual representation of the system structure.
- **[C2] Source Code:** Java/C# implementation of the pattern.
- **[C1] Project Management:** Task tracking via GitHub Project Board.

## 👨‍💻 Author
- **Name:** [Mohammad shoman]
- **Role:** Full Project Implementation & Design
