
//  How to find all pairs on integer array whose sum is equal to given number?
/* For example, if the input integer array is {2, 6, 3, 9, 11} and 
 the given sum is 9, the output should be {6,3} */

public class sumEqualPairs {

    void pairsCheck(int[] arr, int item){
        for(int i = 0;i<arr.length;i++){
            int firstNum = arr[i];
            for(int j =i+1; j<arr.length;j++){
                int secondNum = arr[j];
                int sum = firstNum+secondNum;
                if(item==sum){
                    System.out.println(firstNum+" "+secondNum);
                    System.out.printf("(%d, %d) %n", firstNum,secondNum);
                    break;
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {2,6,3,9,11};
        int item = 9;
        sumEqualPairs mEqualPairs = new sumEqualPairs();
        mEqualPairs.pairsCheck(arr,item);
    }
}
