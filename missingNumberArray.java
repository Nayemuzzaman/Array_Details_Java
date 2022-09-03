import java.util.Arrays;
import java.util.BitSet;
/*
 * 1. How to find the missing number in integer array of 1 to 100?
This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview. 
You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array. 
You cannot use any open source library or Java API method which solves this problem. 
One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, the difference would be the missing number.

 */

public class missingNumberArray {
    void missingNumber(int[] numbers, int count){
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for(int number: numbers){
            bitSet.set(number);
        }
    System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
    Arrays.toString(numbers), count);
    int lastMissingIndex = 1;

    for (int i = 0; i < missingCount; i++) {
        lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
        System.out.println(lastMissingIndex++);
    }

    }
    public static void main(String[] args){
        missingNumberArray mna = new missingNumberArray();
        int[] numbers = {1,2,4,6,7,8};
        int count = 10;
        mna.missingNumber(numbers, count);
    }
}
