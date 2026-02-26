interface add {
    int add(int a, int b);     //abstract method

    char[] sum(int i, int j);

}
public class Interface_add {
    public static void main(String[] args) {
        add obj = new add(){
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public char[] sum(int i, int j) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'sum'");
            }
        };
       System.out.println(obj.sum(5, 10));
    }
}
