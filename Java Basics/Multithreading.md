# 🧵 Java Multithreading

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.

---

## 🔹 Creating Threads

### 1. By Extending Thread Class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
```

### 2. By Implementing Runnable Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
```

---

## 🔹 Thread Methods

| Method         | Description                       |
|----------------|-----------------------------------|
| `start()`      | Starts a thread                   |
| `run()`        | Entry point for thread            |
| `sleep(ms)`    | Suspends thread for given time    |
| `join()`       | Waits for thread to die           |
| `isAlive()`    | Checks if thread is alive         |

---

## 🔹 Thread Priorities

```java
Thread t1 = new Thread();
t1.setPriority(Thread.MAX_PRIORITY); // 10
```

---

## 🔹 Synchronization

Used to prevent thread interference.

```java
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

---

## 🔹 Inter-thread Communication

### wait(), notify(), notifyAll()

```java
synchronized(obj) {
    obj.wait();
    obj.notify();
}
```

---

## 🔹 Daemon Thread

```java
Thread t = new Thread();
t.setDaemon(true);
t.start();
```
