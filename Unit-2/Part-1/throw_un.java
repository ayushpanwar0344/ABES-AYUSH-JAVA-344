public class throw_un {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();         //Unchecked , Object is to be created
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
