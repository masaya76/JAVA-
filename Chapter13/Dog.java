package Chapter13;

public class Dog extends Animal {
    public Dog() {
      this.name = "hoge";
    }

    public void cry() {
        System.out.println(this.name + "Barked. wan! wan!");
    }
}
