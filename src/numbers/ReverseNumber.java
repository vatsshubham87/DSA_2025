package numbers;

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 65784383;

        while(n > 0){
            int r = n%10;
            System.out.println(r);
            n = n/10;
        }


    }
}
