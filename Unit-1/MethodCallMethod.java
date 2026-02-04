public class MethodCallMethod {
    
    void methodA(){
        System.out.println("Inside Method A");
        methodB();                  //Calling methodB() inside methodA()
    }

    void methodB(){
        System.out.println("Inside Method B");
    }

    public static void main(String[] args) {
        MethodCallMethod obj = new MethodCallMethod();
        obj.methodA();              //Calling methodA() which in turn calls methodB()
    }
}
