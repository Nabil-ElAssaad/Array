import java.util.Arrays;

public class PalindromeString {

    public static void main(String[] args) {
       String s1 = "madam" ;
        String s3 = "";
        for( int i = s1.length()-1 ; i >= 0  ; i--) {
            s3 = s3+s1.charAt(i); }
            System.out.println(s3);

        if (s1.equals(s3)) {
            System.out.println("pali");

        }else {
            System.out.println("Not Pali");
        }

    }
}
