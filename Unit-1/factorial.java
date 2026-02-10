public class factorial {
    
    static int factorialrecursion(int n) {
        if(n==0 || n==1) {
            return 1;              //base case
        }
        return n*factorialrecursion(n-1);          //recursive call
    }

    static int factorialalitrative(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " using recursion: " + factorialrecursion(number));

        System.out.println("Factorial of " + number + " using alitrative method: " + factorialalitrative(number));

    }
}
