abstract class vehicle {
    abstract void start();  //no body will be given

    void fuel(){
        System.out.println("fuel");
    }

}

class car extends vehicle{
    void start(){
        System.out.println("car start hai");
    }
}

class fighterJet extends vehicle{
    void start(){
        System.out.println("Ready to take off");
    }
}



public class abstractexample {
    public static void main(String[] args) {
        vehicle v1 = new car();
        v1.start();
        v1.fuel();

        vehicle v2 = new fighterJet();
        v2.start();
        v2.fuel();
    }
}
