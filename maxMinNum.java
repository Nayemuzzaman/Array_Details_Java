//  How to find largest and smallest number in unsorted array? (solution)


public class maxMinNum {

    void maxAndMin(int[] arr){
        // Integer.MAX_VALUE = 2147483647
        // Integer.MIN_VALUE = -2147483648
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : arr) {
            if(max<number){
                max = number;
            }else if(min>number){
                min = number;
            }
        }

        System.out.println("Max value: "+max+"\n"+"Min value: "+ min);
    }
    

    public static void main(String[] args) {
        int[] arr = {1,2, 0,-1,-7};
        maxMinNum mmn = new maxMinNum();
        mmn.maxAndMin(arr);
    }
}
