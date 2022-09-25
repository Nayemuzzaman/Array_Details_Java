# Array_Details_Java
All about array with java (help with interview)


1. How to find the missing number in integer array of 1 to 100?
This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview. 
You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array. 
You cannot use any open source library or Java API method which solves this problem. 
One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, the difference would be the missing number.

Solution Name : missingNumber.java

2. Write a program to remove duplicates from array in Java?

Solution Name : repeatDublicateNumber.java

-------------
1) What is ArrayStoreException in java? When you will get this exception?

ArrayStoreException is a run time exception which occurs when you try to store non-compatible element in an array object. The type of the elements must be compatible with the type of array object. For example, you can store only string elements in an array of strings. if you try to insert integer element in an array of strings, you will get ArrayStoreException at run time.

public class arrayStoreException {

    public static void main(String[] args) {
        Object[] aObjects = new String[5];
        aObjects[1] = "Java";
        aObjects[2] = 100; // No compile time error
        // because we insertinng integer element into array of strings
        System.out.println(aObjects[1]);
    }
}

