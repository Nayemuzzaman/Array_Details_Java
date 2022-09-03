import java.util.BitSet;

/*
 * The nextClearBit(int fromIndex) method of Java BitSet class returns the index of first bit which is set to false that occurs on or after the specified index.

 */
public class bitsetNextclearbit {
 
    public static void main(String[] args) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
    
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);


        System.out.println("bs1 : "+bs1);
        for(int i=1; i<=2;i++){
            System.out.println(bs1.nextClearBit(i));

        }
    
    }
}
