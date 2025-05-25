# 👨‍💻 Java OOPs Concepts

Java is an Object-Oriented Programming language. It follows 4 key pillars:

## 1. Encapsulation
- Wrapping data and methods in one unit (class).
```java
class Student {
    private int age;

    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
}
```

## 2. Inheritance
- Acquiring properties from a parent class.

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}
```

## 3. Polymorphism

### Method Overloading
```java
class Add {
    int sum(int a, int b) { return a + b; }
    int sum(int a, int b, int c) { return a + b + c; }
}
```

### Method Overriding
```java
class Animal {
    void speak() { System.out.println("Animal speaks"); }
}
class Dog extends Animal {
    void speak() { System.out.println("Dog barks"); }
}
```

## 4. Abstraction
- Hiding internal details and showing functionality only.

### Abstract Class
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing circle"); }
}
```

### Interface
```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flies");
    }
}
```

## 🔄 Access Modifiers

| Modifier   | Class | Package | Subclass | World |
|------------|-------|---------|----------|--------|
| private    | ✔️    | ❌       | ❌        | ❌      |
| default    | ✔️    | ✔️       | ❌        | ❌      |
| protected  | ✔️    | ✔️       | ✔️        | ❌      |
| public     | ✔️    | ✔️       | ✔️        | ✔️      |
