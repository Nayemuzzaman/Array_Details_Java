import java.util.Arrays;
/* delete dublicate number  */
public class deletedublicateNumber {
    int[] DublicateNumDel(int[] arr){
        Arrays.sort(arr);
        int count=0;
        int[] result = new int[arr.length];
        int prevoius = arr[count];
        result[count] = prevoius;
        
        for(int i =1; i<arr.length;i++){
            int ch = arr[i];
            if(prevoius!=ch){
                count++;
                result[count]=ch;
            }
            prevoius = ch;
        }
        for(int z = 0; z<=count;z++){
            System.out.println("Total after remove Number: "+count+" & "+z+" no. is "+result[z]);
        }
        return result;
    }
    
public static void main(String[] args) {
    int[] arry = {1,2,3,2,1,3,4,5,6,7,7};
       
    deletedublicateNumber delNum = new deletedublicateNumber();
    delNum.DublicateNumDel(arry);
}
}
