import java.util.Scanner;

public class input {
    //scanner = microphone
    //user = speaker
    //java programe = listener

    //Scanner is used for user input and also to get files
    //Takes input from user at runtime
    //it comes under util

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        System.out.println(num);

        //nextDouble()

        //nextFloat()

        //nextLong()

        //next()       to grt a single word

        //nextLine()       for full sentence

        //nextBoolean()      for true or false


        int n = sc.nextInt();        //    This will
        String name = sc.nextLine(); //    create a buffer

        int m = sc.nextInt();
        sc.nextLine();               //This will remove the buffer
        String ma = sc.nextLine();

        int a = sc.nextInt();
                                     //This will also remove the buffer
        String ab = sc.nextLine();

    }
}
