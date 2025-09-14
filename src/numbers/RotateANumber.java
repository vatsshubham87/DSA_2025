package numbers;

public class RotateANumber {

    public static void main(String[] args) {

        int num = 27391;
        int k = -1;
        int temp = num;
        int count = 0;

        while(temp > 0){
            temp = temp/10;
            count++;
        }

        k = k % count;

        if(k < 0){
            k = k + count;
        }

        int div =  (int) Math.pow(10, k);

        int rem = num % div;
        int rem_count = count - k;
        int mul = rem * (int) Math.pow(10,rem_count);
        num = num / div;
        int sum = mul + num;

        System.out.println(sum);

    }
}
