public class switchdemo {
    public static void main(String[] args) {
        int day = 2;

        String result = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Error";
        };
        System.out.println("The day is: " + result);
    }
}
