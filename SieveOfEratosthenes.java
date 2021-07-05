import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        //prim no.
    boolean[] isPrim = SieveOfEratosthenes(35);
    for(int i=0;i<=35;i++){
        System.out.println(i+" "+isPrim[i]);
    }
    //gcd
        System.out.println(gcd(15,27));
        System.out.println(gcd(24,60));
    }

    //Sieve Of Eratosthenes method
    static boolean[] SieveOfEratosthenes(int n){
        boolean[] isPrim = new boolean[n+1];

        Arrays.fill(isPrim,true);

        isPrim[0]=false;
        isPrim[1]=false;

        for(int i=2 ;i*i<=n;i++){

            for(int j =2*i;j<=n;j+=i){
                isPrim[j] = false;
            }
        }

        return isPrim;
    }
//gcd method
    static int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
}


