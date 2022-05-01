package Chapter14;

public class Employee14 extends Human14 {
    private String department;

    public Employee14(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getProfile() {
        String profile = "Age is " + this.age;   /*this => super ?*/ 
        profile += "The office worker`s department is " + this.department + ".";
        return profile;
    }
}
