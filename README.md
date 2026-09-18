# Assignment 2: Creational Patterns (Factory Method & Abstract Factory)

**Theme:** Payment Terminal

## Overview
This repository implements two creational design patterns in the domain of a Payment Terminal:
1. **Factory Method (Part A):** Handles the creation of individual payment processors (`PaymentProcessor`).
2. **Abstract Factory (Part B):** in process.

## Domain Architecture

### Part A: Factory Method
- **Product:** `PaymentProcessor`
- **Concrete Products:** `VisaProcessor`, `LocalCardProcessor`, `CryptoProcessor`
- **Creator:** `TerminalCreator` ( would contain `executeTransaction()` business logic)
- **Concrete Creators:** `VisaTerminalCreator`, `LocalTerminalCreator`, `CryptoTerminalCreator`