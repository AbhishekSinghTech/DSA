# DSA
Data Structure &amp; Algorithm by Java

# Chapter 01: Introduction to Data Structures and Algorithms
Data Structure is a way of collecting and organising data in such a way that we can perform operations on these data in an effective way.
## Why are Data Structures Important?

1. Efficient Data Management
   - Store data in an organized manner.
2. Improve Performance
   - Accessing, searching, inserting or deleting elements become faster.
3. Reduce Complexity
   - Code becomes simpler and easier to understand.
4.  Data Abstraction
    - Hide the complexity of underlying implementation from user.
5. Problem Solving
   - Provides a framework for solving complex problems using simple building blocks (data structures).

## Types of Data Structures
1. Linear Data Structures (One Dimensional)
   - Arrays
   - Linked Lists
2. Non-Linear Data Structures (Multi-Dimensional)
   - Trees
   - Graphs
3. Advanced Data Structures
   - Hash Tables/Hash Maps
   - Stacks
   - Queues
   - Heaps
## What are the Real World Applications of Data Structures?
1. Database Management Systems
   - Data structures are used to store and organize large amounts of data in a structured manner.
2. Operating Systems
   - Data structures are used to manage resources, such as memory allocation and process scheduling.
3. Graphical User Interfaces
   - Data structures are used to store and display hierarchical data, such as the file system in a computer's file explorer. 
4. Computer Networks 
    - Data structures are used to store information about network topology and to implement routing algorithms.
5. Web Servers
    - Used to store information about web pages so that they can be served efficiently when requested.

# Section 02: Arrays in Java
- Array is a linear data structure.It is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.
## Application of Array Data Structure
- A basic application of Arrays can be storing data in tabular format. For example, if you have a list of students
- It is also used in speech processing, in which each speech signal is an array. 
- Book titles in a Library Management Systems.
- Online ticket booking.
- Contacts on a cell phone.
- To store the possible moves of chess on a chessboard.
- To store images of a specific size on an android or laptop.
## Advantages
1. Easy to use
   - Arrays are the simplest form of data structures and are easy to use. They allow us to store and access elements in a contiguous memory block.
2. Random access
   - Arrays allow us to access elements via their index randomly.
3. Performance
   - The performance of array is very good as it allows random access to the elements.
## Disadvantages
1. Fixed-size
   - The size of an array is fixed. Once the size is declared, it cannot be changed.
2. Lack of flexibility
   - Arrays are not very flexible as they have a fixed size. If you want to add more data, you cannot do it in this array. You must create another array with larger capacity and copy old array elements into the new one.
3. Overhead
   - When working with arrays, an overhead is involved in terms of time and memory. For example, when creating an array, you must allocate a certain amount of memory space for the array in advance, even if you need to know how much data will be stored.
## Arrays Creations
1. Declares an array of integers
   - int[] anArray;
   - Allocates memory for 10 integers
   - anArray = new int[10]; 
   - Initialize first element
   - anArray[0] = 100;
   - int anArray[]={10,20,30};

## Accessing Elements of An Array
1. Using Index
   - Syntax : arr[index]
   - Example : int x=arr[3]; //accessing 4th element using index 3
2. Using dot operator (.)
   - Syntax : arr.length
   - Example : System.out.println(anArray.length);//prints number of elements in array
## Searching Techniques
