import java.util.Arrays;

public class repeatDublicateNumber {
    
    void repeatDublicateNum(int[] arr){
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int preNum = arr[0];
        result[0] = preNum;

        for(int i=1;i <arr.length;i++){
            int ch = arr[i];
            if(preNum != ch){
                result[i]=ch;
            }
            preNum = ch;
            
            System.out.println(result[i]);
        }
        

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 5, 5, 7, 8};
        repeatDublicateNumber rNumber = new repeatDublicateNumber();
        rNumber.repeatDublicateNum(arr);
    }
}
