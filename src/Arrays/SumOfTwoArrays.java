package Arrays;

public class SumOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {9,3,4,6,8};
        int n1 = arr1.length;
        int[] arr2 = {1,9,8,8};
        int n2 = arr2.length;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int[] arr;
        if(n1>n2){
            arr = new int[n1];
        }
        else{
            arr = new int[n2];
        }
        int carry = 0;
       while(i>=0 && j>=0){

           int sum = carry + arr1[i] + arr2[j];
           int n = sum;
           int val = sum % 10;
           carry = n / 10;

           if(n1>n2){
               arr[i] = val;
           }
           else{
               arr[j] = val;
           }
           i--;
           j--;
       }

       while(i>=0){
           arr[i]  = arr1[i];
           i--;
       }

        while(j>=0){
            arr[j] = arr2[j];
            j--;
        }

        for (int k : arr) {

            System.out.println(k);

        }

    }
}
