import java.util.Arrays;

public class binarySearchString {


    public static void main(String[] args) {
        String[] names = {"ab","bc","cd","ef","gh"};
        Arrays.sort(names);
        int left = 0, right = names.length-1, middle;
        String findName = "bc";

        middle = (left + right)/2;
        if(names[middle]==findName){
            System.out.println("Found"+middle);
        } 
    }
    
}
