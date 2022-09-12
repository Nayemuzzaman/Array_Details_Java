public class GenericMethodArray {

    public static <N> void printGMethod(N[] inputArr){
        for(N element: inputArr){
            System.out.print(element);
        }
    }


    public static void main(String[] args){
        Integer[] intArr = {1,2,3,4,5};
        System.out.println("integer value");
        printGMethod(intArr);
        Double[] dArr = {1.1,2.1,3.1,4.1,5.1};
        System.out.println("\nDouble value");
        printGMethod(dArr);
        System.out.println("\n Character value");
        Character[] cArr = {'N', 'A', 'Y','E','M'};
        printGMethod(cArr);
    }
}
