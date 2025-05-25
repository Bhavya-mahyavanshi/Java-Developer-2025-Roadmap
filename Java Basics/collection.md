# 📦 Java Collections Framework

The Java Collections Framework provides data structures to store and manipulate groups of data efficiently.

## 🔗 Interfaces Overview

| Interface   | Description                        |
|-------------|------------------------------------|
| List        | Ordered, allows duplicates         |
| Set         | Unordered, no duplicates           |
| Map         | Key-value pairs                    |
| Queue       | FIFO structure                     |

---

## ✅ List Interface

### ArrayList
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println(list.get(0));
```

### LinkedList
```java
import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();
list.add(10);
list.addFirst(5);
```

---

## 🔀 Set Interface

### HashSet
```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
set.add("A");
set.add("B");
set.add("A"); // ignored
```

### TreeSet (Sorted)
```java
import java.util.TreeSet;

TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(5);  // sorted automatically
```

---

## 🔑 Map Interface

### HashMap
```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("John", 25);
System.out.println(map.get("John"));
```

### TreeMap (Sorted by key)
```java
import java.util.TreeMap;

TreeMap<Integer, String> map = new TreeMap<>();
map.put(2, "Two");
map.put(1, "One");  // sorted by key
```

---

## ⏳ Queue

### PriorityQueue
```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(5);
System.out.println(pq.poll()); // outputs 5 (min-heap)
```

---

## 🧠 Summary

- Use **ArrayList** for indexed access.
- Use **LinkedList** for frequent insert/delete.
- Use **HashSet** for unique items.
- Use **HashMap** for key-value pairs.
- Use **PriorityQueue** for ordered processing.
