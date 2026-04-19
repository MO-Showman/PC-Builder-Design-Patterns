# 🖥️ PC Builder System - Design Patterns Project

## 📌 Project Overview
This project is developed as part of the **Design Patterns Course (Case 1)**. The main objective is to analyze a real-world software problem, compare design approaches, and implement a suitable design pattern. 

**Selected Pattern:** Builder Pattern (Creational)

## 🎯 The Real-World Problem
In e-commerce systems for customizing personal computers (PCs), building a `PC` object is highly complex. A PC consists of mandatory components (CPU, Motherboard, RAM) and optional components (Liquid Cooling, RGB Lighting, extra Storage). Using a standard constructor leads to the **Telescoping Constructor Anti-Pattern**, making the code hard to read, scale, and maintain.

## 🛠️ The Solution (Builder Pattern)
To solve this complexity, we implemented the **Builder Design Pattern**. It separates the construction of a complex `PC` object from its representation, allowing the same construction process to create different representations (e.g., `GamingPC`, `OfficePC`).

## 📂 Project Deliverables
- 📝 **[Problem Analysis & Trade-offs](./Problem-Analysis-Report.md)**
- 🎯 **[Pattern Selection & Justification](./Pattern-Justification.md)**
- 📊 **[UML Class Diagram](./UML-Diagram.md)**
- 💻 **[Source Code Implementation](./src/)**
- 📄 **[Presentation Slides (PDF)](./presentation-slides.pdf)**
- 🎬 **[Presentation Video (Watch Here)]([ضع_الرابط_هنا](https://drive.google.com/file/d/1ljVbDAuoO7JISB93vZlVU_Hu1unbpTd1/view?usp=sharing))**

## 👨‍💻 Author
- **Name:** [Mohammad shoman]
- **Role:** Full Project Implementation & Design
