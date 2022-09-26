// array swap integer 
public class arraySwapInt {
    void arraySwap(int[] ar){
        System.out.println("Given Array");
        for(int i: ar){
            System.out.print(i);
        }
        int temp = ar[1];
        ar[1] = ar[3];
        ar[3] = temp;
        System.out.println("\nSwap Array");

        for(int j : ar){
            System.out.print(j);
        }
    }
    public static void main(String[] ars){
        int arr[] = {1,2,3,4,5};
        arraySwapInt mArraySwapInt = new arraySwapInt();
        mArraySwapInt.arraySwap(arr);
    }
}
