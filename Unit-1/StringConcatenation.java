public class StringConcatenation {
    String firstName = "Ayush";
    String lastName = "Panwar";

    void displayFullName(){
        // Using + operator
        String fullName1 = firstName + " " + lastName;
        System.out.println("Full Name using + operator: " + fullName1);

        // Using concat() method
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name using concat() method: " + fullName2);
    }

    public static void main(String[] args) {
        StringConcatenation obj = new StringConcatenation();
        obj.displayFullName();
    }
}
