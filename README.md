# Design_Pattrens

# Creational Design Patterns – Java

This repository contains **well-structured explanations and Java examples** of all **Creational Design Patterns**, written for **interview preparation and real-world Spring Boot usage**.

---

## 📌 What are Creational Design Patterns?

Creational Design Patterns focus on **how objects are created**.  
They **reduce tight coupling**, **improve flexibility**, and **control object creation**.

---

## 🧩 Patterns Covered

1. Singleton  
2. Factory Method  
3. Abstract Factory  
4. Builder  
5. Prototype  

---

## 1️⃣ Singleton Pattern

### 🔹 Definition
Ensures a class has **only one instance** and provides a **global access point** to it.

### 🔹 Problem
Creating multiple instances of resource-heavy objects like:
- Database connections
- Logger
- Configuration classes

### 🔹 Solution
- Make constructor `private`
- Use a static method to return the single instance

### 🔹 Java Example (Thread-Safe)
```java
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
