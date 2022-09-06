import java.util.Arrays;
//single dublicate value print 
public class singleDublicateValue {
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
       
        singleDublicateValue sda = new singleDublicateValue();
        sda.dublicateNumber(arr);

    }
}
