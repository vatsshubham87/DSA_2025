package numbers;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] arr = new int[t];

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            arr[i] = n;
        }

        for(int i=0;i<arr.length;i++){

            boolean flag = false;

            int m = arr[i];

            for(int j=2;j*j<=m;j++){

                if(m % j == 0){
                    System.out.println("not prime");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("prime");
            }
        }
    }


}
