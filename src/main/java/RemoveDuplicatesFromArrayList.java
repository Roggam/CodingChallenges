import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(7);
        primes.add(11);


        System.out.println("list of primes without duplicates : " + primes);
        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<>(primes);

        primes.addAll(primesWithoutDuplicates);

        System.out.println("list of prime numbers : " + primes);

    }


}
