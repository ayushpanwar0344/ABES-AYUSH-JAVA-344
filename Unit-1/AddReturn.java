public class AddReturn {

    //Method overloading with return type
    //run at compile time
    
    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        AddReturn s1 = new AddReturn();      //Object created
        System.out.println(s1.add(10 , 20));
        System.out.println(s1.add(10 , 20 , 30));
    }
}
