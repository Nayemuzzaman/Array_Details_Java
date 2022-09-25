
/**
 * arrayStoreException
 */

 // What is ArrayStoreException in java? When you will get this exception?
/*
 * ArrayStoreException is a run time exception which occurs when you try to store non-compatible element in an array object. The type of the elements must be compatible with the type of array object. For example, you can store only string elements in an array of strings. if you try to insert integer element in an array of strings, you will get ArrayStoreException at run time.


 */

public class arrayStoreException {

    public static void main(String[] args) {
        Object[] aObjects = new String[5];
        aObjects[1] = "Java";
        aObjects[2] = 100; // No compile time error
        // because we insertinng integer element into array of strings
        System.out.println(aObjects[1]);
    }
}
