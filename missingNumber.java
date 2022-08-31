/*
 * 1. How to find the missing number in integer array of 1 to 100?
This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview. 
You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array. 
You cannot use any open source library or Java API method which solves this problem. 
One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, the difference would be the missing number.

 */


public class missingNumber {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
        int originalSum =0;
        int m = 0;
        int value;
        for(int i = 1; i<=10; i++){
            originalSum=originalSum+i;
            if (arr.length>=i) {
                m+=arr[i-1];
            }
        }
        System.out.println("given value sume"+m+"\nhave to value"+originalSum);
    value = originalSum-m;
    System.out.println("missing value"+value);
    }
}
