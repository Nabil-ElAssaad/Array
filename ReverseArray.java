import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        reverseArray(new  int[ ] {1,2,3,4,5});
    }
    public  static  void reverseArray (int [] arr) {
        int len = arr.length ;

        /*for (int i = len-1 ; i >=0 ;i--) {
            System.out.print(arr[i] + " ");
        } */
        int temp ;
        int start = 0 ;
        int end = len-1 ;

        for (int i = 0 ; i < len ; i++) {
            while (start<end) {
              temp = arr[start];
              arr[start] = arr[end] ;
              arr[end] = temp ;
              start++;
              end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
