public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int intVar = 100;               //default value = 0
        float floatVar = 10.5f;         //default value = 0.0f
        double doubleVar = 20.99;       //default value = 0.0d
        char charVar = 'A';             //default value = '\u0000'
        boolean boolVar = true;         //default value = false (starts with lowercase)

        System.out.println("Integer Value: " + intVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Character Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);

        // Non-Primitive Data Type   (Are built in data types)
        String strVar = "Hello, Java!";    //default value = null & string is not counted in non-primitive data types
        System.out.println("String Value: " + strVar);
    }
}
