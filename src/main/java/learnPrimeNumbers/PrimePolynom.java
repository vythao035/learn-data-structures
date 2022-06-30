package learnPrimeNumbers;

public class PrimePolynom {
    private static boolean isPrime(int n) {
        if (n<=1) return false;
        else if (n==2) return true;
        else if (n%2==0) return false;
        else {
            for (int i=3; i<= Math.sqrt(n); i+=2) {
                if (n%i==0) return false;
            }
        }
        return true;
    }
    public static int reveal(int A, int B, int C) {
        int result = 0;
        for (int M = 0; M < Integer.MAX_VALUE; M++) {
            result = M;
            int tmp = A * M * M + B * M + C;
            if (isPrime(tmp)==false && (tmp > 0)) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reveal(1, -1, 41));
        System.out.println(reveal(1, 1, 41));
        System.out.println(reveal(1, 1, -13));

    }
}
