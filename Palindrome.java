public class Palindrome {
    public static void main(String[] args) {

        //isPalindrome("ABC") ;
        isPalindrome("mom") ;

        }
        public static boolean isPalindrome (String str) {
            char [] c = str.toCharArray() ;
            for (int i = c.length - 1 ; i >= 0 ; i--) {
                for (int j = 0 ; j <= c.length - 1 ; j++) {
                    if (c[i] == c[j]) {
                        System.out.println(str + " is Palindrome");
                        System.exit(0);
                    } else {
                        System.out.println(str + " is not Palindrome");
                        System.exit(0);
                    }
                }
            }
            return false;
        }
    }

