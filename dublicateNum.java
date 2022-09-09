import java.util.Arrays;

/**
 * dublicateNum
 */
public class dublicateNum {
    static int[] removeDubNum(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        int[] result = new int[arr.length];
       

        for ( int i = 1; i<arr.length; i++) {
            int preStep = arr[count];

            int currentNum = arr[i];
            
            if (preStep!=arr[i]) {
                count++;
                result[count] = arr[i-1];
            }
            preStep = currentNum;
            
        }
        return result;
    }


    public static void main (String[] args){
        int [][] arr = {{1,2,3,4,3,4,},
                        {2,3,4,2,4,5},};

        for (int[] input : arr) {
            System.out.println("Full array: "+Arrays.toString(input));
            System.out.println("Remove dublicate number: "+Arrays.toString(removeDubNum(input)));
        }
    }
}