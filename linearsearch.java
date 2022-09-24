//Linear search 
// Every item check one by one loop
public class linearsearch {
    void numSearch(int[] arr, int item){
        for(int a = 0; a<arr.length; a++){
            if(arr[a]==item){
                System.out.println("Found at index "+a);
                return;
            }
        }
        System.out.println("Not Found");
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8};
        int item = 8;
        linearsearch mLinearsearch = new linearsearch();
        mLinearsearch.numSearch(arr, item);
    }
    
}
