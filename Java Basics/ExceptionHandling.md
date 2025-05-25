# ❗ Java Exception Handling

Exception Handling in Java allows a program to handle runtime errors to maintain normal flow.

---

## 🔹 What is an Exception?

An **exception** is an event that disrupts the normal flow of the program.

---

## 🔹 Types of Exceptions

| Type            | Description                              |
|------------------|------------------------------------------|
| Checked Exception | Compile-time errors (e.g., IOException) |
| Unchecked Exception | Runtime errors (e.g., ArithmeticException) |

---

## 🔹 try-catch Block

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

## 🔹 try-catch-finally

```java
try {
    String s = null;
    System.out.println(s.length());
} catch (NullPointerException e) {
    System.out.println("Caught NullPointerException");
} finally {
    System.out.println("Finally block always executes");
}
```

---

## 🔹 throw Keyword

```java
public class Example {
    public static void main(String[] args) {
        throw new ArithmeticException("Demo exception");
    }
}
```

---

## 🔹 throws Keyword

```java
public void readFile() throws IOException {
    // code that may throw IOException
}
```

---

## 🔹 Custom Exception

```java
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class Test {
    public static void main(String[] args) throws MyException {
        throw new MyException("Custom exception thrown");
    }
}
```
