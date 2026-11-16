# Data Structures Assignment 2
## Stack and Queue Implementation in Java

**Submitted by:** Falak Taj Khan  
**Subject:** Data Structures  
**Language:** Java

## Introduction

In this assignment, I have implemented Stack and Queue using arrays in Java. I have also performed different operations and shown their results step by step.

## Project Files

| File Name | Description |
|---|---|
| `StackArray.java` | Q1: Implementation of Stack using an array |
| `QueueArray.java` | Q3: Implementation of Queue using an array |
| `StackTrace.java` | Q2: Step-by-step stack operations |
| `QueueTrace.java` | Q4: Step-by-step queue operations |

## How to Run the Programs

First, compile all Java files:

```bash
javac StackArray.java QueueArray.java StackTrace.java QueueTrace.java
```

Run each program separately:

```bash
java StackArray
java QueueArray
java StackTrace
java QueueTrace
```

**Requirement:** JDK 8 or later.

---

## Part 1: Stack

### Q1. Stack Using Array

A Stack follows the LIFO (Last In, First Out) principle. It means the last inserted element is removed first.

The following operations are implemented:

- **Push:** Adds an element to the stack.
- **Pop:** Removes the top element.
- **Peek:** Shows the top element.
- **Display:** Shows all stack elements.

**Overflow:** Occurs when we try to insert an element into a full stack.

**Underflow:** Occurs when we try to remove an element from an empty stack.

### Q2. Stack Operations

The following operations are performed on the stack.

| Operation | Stack | Top |
|---|---|---|
| Push(10) | [10] | 10 |
| Push(20) | [10, 20] | 20 |
| Push(30) | [10, 20, 30] | 30 |
| Pop() | [10, 20] | 20 |
| Push(40) | [10, 20, 40] | 40 |
| Pop() | [10, 20] | 20 |

**Final Stack:** `[10, 20]`

**Top Element:** `20`

---

## Part 2: Queue

### Q3. Queue Using Array

A Queue follows the FIFO (First In, First Out) principle. It means the first inserted element is removed first.

The following operations are implemented:

- **Enqueue:** Adds an element to the queue.
- **Dequeue:** Removes an element from the queue.
- **Front:** Shows the first element.
- **Display:** Shows all queue elements.

**Overflow:** Occurs when we try to insert an element into a full queue.

**Underflow:** Occurs when we try to remove an element from an empty queue.

**Note:** This is a Linear Queue. The empty spaces created after removing elements cannot be reused.

### Q4. Queue Operations

The following operations are performed on the queue.

| Operation | Queue | Front |
|---|---|---|
| Enqueue(10) | [10] | 10 |
| Enqueue(20) | [10, 20] | 10 |
| Enqueue(30) | [10, 20, 30] | 10 |
| Dequeue() | [20, 30] | 20 |
| Enqueue(40) | [20, 30, 40] | 20 |
| Dequeue() | [30, 40] | 30 |

**Final Queue:** `[30, 40]`

**Front Element:** `30`

---

## Conclusion

In this assignment, I practiced implementing Stack and Queue using arrays in Java. I also learned how Push, Pop, Enqueue, and Dequeue operations work, along with Overflow and Underflow conditions.
