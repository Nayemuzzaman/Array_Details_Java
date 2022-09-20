public class mmNum {

    void testy(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int numer: arr){
            if (max<numer) {
                max = numer;
            }else if(min>numer){
                min = numer;
            }
        }
        System.out.println("max: "+max+" min:"+min);

    }

    public static void main(String[] args) {
        int[] ar = {1,3,5,2,-1};

        mmNum mmNumm = new mmNum();
        mmNumm.testy(ar);
    }
    
}
