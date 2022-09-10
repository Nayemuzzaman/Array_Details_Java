import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args) {
        int arr[] = {3,1,2,4,6,23,5};
        // 1, 2, 3, 4, 5, 6, 23
        Arrays.sort(arr);
        int left = 0, right = arr.length-1, middle;
        int item = 23;
        while(left <= right){
            middle = (left + right) / 2;
            if (arr[middle]==item) {
                System.out.println("item found at "+middle +" position");
                return;
            } else if( arr[middle]<item ){
                left = middle + 1;
            } else{
                right = middle - 1;
            }
        }
        System.out.println("not found");

    }
    
}
