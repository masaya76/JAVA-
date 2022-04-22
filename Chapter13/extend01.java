package Chapter13;

public class extend01 {
    public static void main(String[] agrs) {
        Human sugimoto = new Human("sugimoto", 25);
        System.out.println("Human class metgod: name" + sugimoto.getName() );
        
        Student sato = new Student("sato", 17, 70);
        System.out.println("Human class method: name " + sato.getName() );
        System.out.println("Student class method: profile " + sato.getStudentProfile() );
        
        Human human = new Employee("tanaka", 28, "System department");
        System.out.println("Humanb class method: name " + human.getName() );
        Employee tanaka = (Employee)human;
        System.out.println("Employee class method: profile " + tanaka.getEmployeeProfile() );

        extend01.printName(sugimoto);
        extend01.printName(sato);
        extend01.printName(tanaka);
    }

    public static void printName(Human human) {
        System.out.println("Human class method: name " + human.getName() );
    }
}
