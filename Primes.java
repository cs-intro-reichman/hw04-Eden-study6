public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
    }

    public static void printPrimes(int n) {
    boolean[] isprime = new boolean[n + 1];

    if (n >= 2) {
        for (int i = 2; i <= n; i++) {
            isprime[i] = true;
        }

        int shurus = (int) Math.sqrt(n);
        for (int j = 2; j <= shurus; j++) {
            if (isprime[j]) {
                for (int i = j * j; i <= n; i += j) {
                    isprime[i] = false;
                }
            }
        }
    }

    System.out.println("Prime numbers up to " + n + ":");

    int count = 0;
    
    for (int i = 2; i <= n; i++) {
        if (isprime[i]) {
            System.out.println(i); 
            count++;
        }
    }

    int percent = (int) Math.round(100.0 * count / n);
    System.out.println("There are " + count + " primes between 2 and " + n +
                       " (" + percent + "% are primes)");

}
}