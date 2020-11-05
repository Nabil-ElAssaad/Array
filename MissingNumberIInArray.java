public class MissingNumberIInArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,8} ;
        /*int sum = 0 ;
        int sum1 = 0 ;
        for (int i =0 ; i < a.length ; i++) {
            sum = sum + a[i] ;
        }
        System.out.println("The total is " + sum );

      for (int i =1 ; i <= 5 ; i++) {
        sum1 = sum1 + i ;
    }
        System.out.println("The full total is " + sum1 );
        System.out.println("the missing number is " + (sum1 - sum)); */
        int totalXor = 0 ;
        int arrXor = 0 ;

        for (int i = 1 ; i <= a.length+1 ; i++) {
            totalXor = totalXor ^ i ;
         }
        for (int i = 0 ; i < a.length ; i++) {
            arrXor = arrXor ^ a[i] ;
        }
        System.out.println(totalXor ^ arrXor);

}}
