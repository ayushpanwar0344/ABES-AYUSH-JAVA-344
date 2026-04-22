//Ayush Panwar (2400320100344)
public class Pallindrome {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == n) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
