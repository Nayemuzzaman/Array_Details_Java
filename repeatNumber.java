import java.util.Arrays;
// Write a program to remove duplicates from array in Java?

public class repeatNumber {

    void repeatDublicateNum(int[] ar) {
        Arrays.sort(ar);

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] != ar[i + 1]) {
                System.out.print(ar[i] + " ");

            }
        }

        System.out.println(ar[ar.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 3, 4, 5, 5, 7, 7, 8, 6 };
        repeatNumber rNumber = new repeatNumber();
        rNumber.repeatDublicateNum(arr);
    }
}
