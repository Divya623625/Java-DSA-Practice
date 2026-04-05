import java.util.*;

public class ArraysCC{
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();
        System.out.println("Length of the array is : " + marks.length);
        marks[0] = sc.nextInt();    // phy
        marks[1] = sc.nextInt();    // math
        marks[2] = sc.nextInt();    // bio

        System.out.println("Phy : " + marks[0]);
        System.out.println("Math : " + marks[1]);
        System.out.println("Bio : " + marks[2]);

        // update
        marks[1] = 100;
        System.out.println("Updated Math : " + marks[1]);

        marks[0] = marks[0] + 1; // Adds 1 to the first element
        System.out.println("Updated Phy : " + marks[0]);

        int percentage = (marks[0] + marks[1] + marks[2])/3 ;
        System.out.println("Percentage = " + percentage + "%");
    }
}
/*
👉 Definition:
An array in Java is a collection of elements of the same data type, stored in continuous memory locations, 
and accessed using an index.

🔹 Why Arrays are Needed
Without array:
int a = 10;
int b = 20;
int c = 30;
👉 Problem: Too many variables, difficult to manage

With array:
int arr[] = {10, 20, 30};
👉 One variable stores many values → easy to manage 👍

🔹 Key Characteristics
Stores same type of data (only int / only float)
Index starts from 0
Stored in continuous memory
Size is fixed (cannot change after creation)
Faster access using index

🔹 How Array Works (Important)
If - int arr[] = {10, 20, 30};

Memory looks like:
Index:   0    1    2
Value:  10   20   30

👉 To access:
System.out.println(arr[0]); // 10
System.out.println(arr[1]); // 20

🔹 Types of Arrays
Single Dimensional Array
int arr[] = {1, 2, 3};

Multi-Dimensional Array (2D)
int arr[][] = {
    {1, 2},
    {3, 4}
};

🔹 Declaration, Creation, Initialization
Declaration - int arr[];
Creation syntax : dataType arrayName[] = new dataType[size];
                int arr = new int[5];
Initialization - arr[0] = 10;
                 arr[1] = 20;

👉 OR directly:
int arr[] = {10, 20, 30};

🔹 Advantages
Easy to store multiple values
Saves memory
Fast access using index
Useful in loops

🔹 Disadvantages
Fixed size ❌
Can store only one type ❌
Insertion/deletion is difficult ❌
*/