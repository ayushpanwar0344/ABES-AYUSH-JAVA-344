import java.util.Base64;

public class base64encode {
    public static void main(String[] args) {

        String original = "ayush123";

        String encoded = Base64.getEncoder().encodeToString((original).getBytes());
        System.out.println("encoded: " + encoded);

        byte[] decodedBytes = Base64.getDecoder().decode(encoded);

        String decoded = new String(decodedBytes);

        System.out.println("decoded: " + decoded);
    }
}
