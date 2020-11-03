import java.util.Arrays;

public class addArrayOToAntherArrays {
    public static void main(String[] args) {
        int x [] = {1,2,3,4,5,6,7,8} ;
        int lenOfx = x.length;
        System.out.println(" The first Array is : " + Arrays.toString(x));
        int y [] = {7,8,9,10,11,12,13,14} ;
        int lenOfy = y.length;
        System.out.println(" The 2nd Array is : " + Arrays.toString(y));
        int total = lenOfx + lenOfy ;
        int z [] = new int [total];
            for (int i = 0 ; i < lenOfx ; i++) {
               z[i] = x[i];
                }
                for (int j=0 ; j < lenOfy ; j++) {
                   z[lenOfx]=y[j] ;
                lenOfx++;
                }
        String s1 = Arrays.toString(z);
        System.out.println(" The Merge Array is : " + s1);
}}
