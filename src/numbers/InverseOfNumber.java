package numbers;

public class InverseOfNumber {

    public static void main(String[] args) {

//        int num = 145623;

        int num = 613254;
        int pos = 0;
        int sum = 0;

        while(num > 0){
            int dig = num % 10;
            pos++;
            sum =  sum + pos * (int) Math.pow(10, dig-1);
            num = num/10;
        }

        System.out.println(sum);
    }

}
