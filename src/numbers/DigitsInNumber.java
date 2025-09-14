package numbers;

public class DigitsInNumber {

    public static void main(String[] args) {

        int n = 1554538760;
        int temp = n;
        int count = 0;

        while(temp > 0){

            temp = temp/10;
            count++;
        }

        int val = n;

        while(count > 0){
            int rem = (int) (val % (Math.pow(10, count-1)));
            val = (int) (val / (Math.pow(10, count-1)));
            System.out.println(val);
            val = rem;
            count--;
        }
    }
}
