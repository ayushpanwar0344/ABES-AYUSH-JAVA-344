public class SumConstructor {
    int n;

    SumConstructor(int a , int b) {
        n = a+b;
    }

    void display(){
        System.out.println(n);
    }

    public static void main(String[] args) {
        SumConstructor sum1 = new SumConstructor( 10 , 20);
        sum1.display();
    }
}
