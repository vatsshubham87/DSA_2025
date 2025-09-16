package Recursion;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2}; // -> 2,4,3,2,1

        int s=0;
        int e=arr.length-1;

        int[] reversedArray = reverseArr(arr, s, e);

        for (int j : reversedArray) {
            System.out.print(j + " ");
        }
    }

    private static int[] reverseArr(int[] arr, int s, int e) {

        if(s>e){
            return arr;
        }

        int temp = 0;
        temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        s++;
        e--;

        return reverseArr(arr, s, e);
    }
}
