package Chapter13;

public class Student extends Human {
  private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getStudentProfile() {
        String profile = "Age is" + super.age;
        profile += "Student have a test score of " + this.score;
        return profile;
    }
}
