package Chapter13;

public abstract class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + " had a meal! ");
    } 

    public abstract void cry();
}
