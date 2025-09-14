package Arrays;

import java.util.Scanner;

public class SpanOfArray {

    public static void main(String[] args) {

        int[] arr = {15,30,40,4,11,9};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        int span = max-min;;

        System.out.println("span of array is : " + span);
    }
}
