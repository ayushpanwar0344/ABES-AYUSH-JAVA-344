import java.util.*;

public class SwitchCase2 {
    public static void main(String[] args) {
        int day = 5;
        String result = switch(day) {
            case-1-> "Monday";
            case-2-> "Tuesday";
            case-3-> "Wednesday";
            case-4-> "Thursday";
            case-5-> "Friday";
            case-6-> "Saturday";
            default-> "Invalid input! Please enter a number between 1 and 7.";
        };
        System.out.println(result);
    }
}
