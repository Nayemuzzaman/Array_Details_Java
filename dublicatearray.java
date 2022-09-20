import java.util.Arrays;


/**
 * dublicatearray
 */
public class dublicatearray {
    void dublicateNumber(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            int ch = arr[i];

            if(arr[i]==arr[i+1]){
                 System.out.println(ch);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
       
        dublicatearray da = new dublicatearray();
        da.dublicateNumber(arr);

    }
}