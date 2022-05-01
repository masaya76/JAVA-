package Chapter14;

public class Student14 extends Human14 {
    private int score;

    public Student14(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getProfile() {
        String profile = "Age is " + super.age;
        profile += "Student test ccoreres are " + this.score;
        return profile;
    }
}
