//Ayush Panwar (2400320100344)
interface Phone {
    void makeCall();
    void sendSMS();
}
interface Camera {
    void takePhoto();
    void recordVideo();
}
class SmartPhone implements Phone, Camera {
    public void makeCall() {
        System.out.println("Making a phone call...");
    }
    public void sendSMS() {
        System.out.println("Sending an SMS...");
    }
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
    public void recordVideo() {
        System.out.println("Recording a video...");
    }
}
public class Multiple_Inheritence {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        obj.makeCall();
        obj.sendSMS();
        obj.takePhoto();
        obj.recordVideo();
    }
}
