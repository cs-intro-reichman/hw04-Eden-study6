public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
    }

    public static void printPrimes(int n) {
        // Replace this statement with your code
        boolean [] isprime = new boolean[n+1];
        for(int i=0; i<=n;i++)
        {
            isprime[i]=true;
        }
        
        for(int i=2;i<n-1;i+=2)
        {
            if(i/2 !=0)
          {  isprime[i]=false;}
        }
           for(int i=3;i<n-2;i+=3)
        {
            if(i%3 ==0&&i!=3)
          {  isprime[i]=false;}
        }
             for(int i=3;i<n-2;i+=3)
        {
            if(i%3 ==0&&i!=3)
          {  isprime[i]=false;}
        }

        System.err.println("Prime numbers up to "+ n + ":");
        for(int i=0;i<=1;i++)
        {
            if(isprime[i]==true)
            {
                System.out.print(i+" ");
            }
        }   
}
}