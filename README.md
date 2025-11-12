# Zoo Management System

A Java application demonstrating the **Builder** and **Visitor** design patterns for managing zoo animals and staff operations.

## 🏗️ Design Patterns

### Builder Pattern
Used to create complex animal objects step by step with dedicated builder classes for each animal type.

### Visitor Pattern
Separates operations from the objects they operate on, allowing different staff roles to perform actions on animals without modifying the animal classes.

## 📁 Project Structure
src/
├── builder/
│ ├── AnimalBuilder.java
│ ├── LionBuilder.java
│ ├── MonkeyBuilder.java
│ └── WolfBuilder.java
│
├── model/
│ ├── Animal.java
│ ├── Lion.java
│ ├── Monkey.java
│ └── Wolf.java
│
├── collection/
│ └── ZooCollection.java
│
├── visitor/
│ ├── AnimalVisitor.java
│ ├── Cleaner.java
│ ├── Trainer.java
│ └── Veterinarian.java
│
└── main/
├── Zoo.java
└── ZooDemo.java

text

## 🦁 Animal Creation with Builder


// Example: Creating a lion using the Builder pattern
Animal lion = new LionBuilder()
        .setName("Simba")
        .setAge(5)
        .setWeight(190.5)
        .build();
👨‍💼 Staff Operations with Visitor
java
// Apply operations to all animals in the zoo
zoo.acceptAll(new Cleaner());
zoo.acceptAll(new Trainer());
zoo.acceptAll(new Veterinarian());
🎯 Key Features
ZooCollection Management
The ZooCollection class provides batch processing for all animals:

java
public void acceptAll(AnimalVisitor visitor) {
    for (Animal animal : animals) {
        animal.accept(visitor);
    }
}
Staff Visitors
Cleaner - Cleans animal cages and enclosures

Trainer - Trains animals to perform tricks

Veterinarian - Examines and treats animals

🚀 Execution Flow
Zoo (main class) runs ZooDemo

ZooDemo:

Builds animals using dedicated Builders

Adds them to ZooCollection

Creates Visitor instances for different staff roles

Applies visitors to all animals using acceptAll()

📋 Example Output

=== Cleaner visiting animals ===
Cleaner: Cleaning lion cage, changing water
Cleaner: Cleaning monkey enclosure, removing banana peels
Cleaner: Cleaning wolf cage, changing water

=== Trainer visiting animals ===
Trainer: Training lion to jump through hoop
Trainer: Training monkey to ride bicycle
Trainer: Training wolf to follow commands

=== Veterinarian visiting animals ===
Veterinarian: Treating lion - checking teeth, giving injection
Veterinarian: Treating monkey - checking temperature, giving vitamins
Veterinarian: Treating wolf - treating wounds, giving vaccine
