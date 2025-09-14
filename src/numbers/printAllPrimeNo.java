package numbers;

import java.util.Scanner;

public class printAllPrimeNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        int high = sc.nextInt();

        boolean flag;

        for(int i=low;i<=high;i++) {
            flag = false;
            for(int j=2;j*j<=i;j++){

                if(i % j == 0){
//                    System.out.println("not prime");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }
}
