package Chapter13;

public class Chapter13 { 
    public static void main(String[] agrs) {
        MobilePhone mobilephone = new MobilePhone("000-1111-2222");
        mobilephone.takePicture();
        Chapter13.staticCall(mobilephone, "99-8888-7777");
        mobilephone.poweroff();

        FlyingPhone flyingPhone = new FlyingPhone(5);
        flyingPhone.fly();
        Chapter13.staticCall(flyingPhone, "000-1111-2222");
        flyingPhone.poweroff();
    }
    
    public static void staticCall(Phone phone, String number) {
        phone.call(number);
    }
}
