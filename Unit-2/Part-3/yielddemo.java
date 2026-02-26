public class yielddemo {
    public static void main(String[] args) {
        int day = 1;
        String result = switch(day) {
            case 1 -> {
                System.out.println("running");
                yield "Monday";
            } default->"error";
        };
        System.out.println("The day is: " + result);
    }
}
