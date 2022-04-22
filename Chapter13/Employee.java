package Chapter13;

public class Employee extends Human {
    private String department;

    public Employee(String name, int age, String department) {
        super(name,age);
        this.department = department;
    }

    public String getEmployeeProfile() {
        String profile = "Age is " + this.age;
        profile += "He is salaryman and the department is " + this.department;
        return profile;
    }
}
