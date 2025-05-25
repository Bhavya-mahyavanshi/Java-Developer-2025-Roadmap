# ☕ Java Syntax Cheat Sheet

## 1. Basic Structure of a Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 2. Data Types

```java
int age = 20;
float price = 10.5f;
double pi = 3.14159;
char grade = 'A';
boolean isValid = true;
String name = "Bhavya";
```

## 3. Variables and Constants

```java
int a = 10;
final int CONSTANT = 100; // final = constant
```

## 4. Conditionals

```java
if (a > 0) {
    System.out.println("Positive");
} else if (a < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

## 5. Loops

```java
// for loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// while loop
int i = 0;
while (i < 5) {
    System.out.println(i++);
}

// do-while loop
int j = 0;
do {
    System.out.println(j++);
} while (j < 5);
```

## 6. Arrays

```java
int[] nums = {1, 2, 3, 4};
String[] names = new String[5];
```

## 7. Methods

```java
public static int add(int a, int b) {
    return a + b;
}
```

## 8. Switch Statement

```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```
