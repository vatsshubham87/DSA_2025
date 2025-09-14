package Arrays;

public class FindElementInArray {

    public static void main(String[] args) {

        int[] arr = {15,30,40,4,11,9};

        int element = 40;

        for(int i=0;i<arr.length;i++){
            if(element == arr[i]){
                System.out.println("element found at index : " + i);
            }
        }
    }
}
