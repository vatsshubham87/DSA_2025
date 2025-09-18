package Recursion;

public class CheckPalindrome {

    public static void main(String[] args) {

            String str = "sshubhass";
            int s = 0;
            int e = str.length()-1;
        boolean palindrome = palindrome(str, s, e);

        System.out.println(palindrome);
    }

    private static boolean palindrome(String str, int s, int e) {

        if(s >= e){
            return true;
        }

        if(str.charAt(s) != str.charAt(e)){
            return false;
        }

        s++;
        e--;

        return palindrome(str, s, e);

    }
}
