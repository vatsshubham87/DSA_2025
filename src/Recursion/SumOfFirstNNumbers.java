package Recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int sum = sum(n, total);
        System.out.println(sum);
    }

    private static int sum(int n, int total) {

       if(n==0){
           return total;
       }

       return n + sum(n-1, total);
    }
}
