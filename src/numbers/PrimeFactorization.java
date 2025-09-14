package numbers;

public class PrimeFactorization {

    public static void main(String[] args) {

        int num = 1876;
        int primeNo = 2;
        while(num >= 0){

            if(isPrime(primeNo)){
                if(num % primeNo == 0){
                    num = num / primeNo;
                    System.out.print(primeNo+" ");
                }
                else{
                    primeNo++;
                }
            }
            else {
                primeNo++;
            }
        }

    }

    private static boolean isPrime(int n) {

        for(int i=2;i*i<=n;i++){

            if(n%i==0){
                return false;
            }
        }

        return true;

    }
}
