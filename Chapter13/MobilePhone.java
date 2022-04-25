package Chapter13;

public class MobilePhone implements Phone, Camera {
    private String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void takePicture() {
        System.out.println("Take a photo");
    }

    public void call(String number) {
        System.out.println("call " + number + "from" + this.number);  
    }
}
