//Ayush Panwar (2400320100344)
public class Prime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        if (n == 2) {
            System.out.println("Prime");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
