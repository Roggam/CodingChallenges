import java.math.BigInteger;

public class IsPrimeNumber {
    public static void main(String[] args) {

        String num = "4";

        BigInteger prime = new BigInteger(num);

        if(prime.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }


    }
}
