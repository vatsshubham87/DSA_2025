package numbers;

import java.util.Scanner;

public class countDigits {

//    934562

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        while(n > 0){

            n = n/10;
            count++;
        }

        System.out.println("no. of digits : "+count);
    }
}

