package Chapter14;

public class Human14 {
    private String name;
    protected int age;

    public Human14(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfile() {
        return "His name is " + this.name + " and he is " + this.age + " years old.";
    }
}
