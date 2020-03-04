package fo.tsk.jsi.Jgt01Basics;

public class PersonDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Sam", "Gleðisheygg");
        System.out.println(p1.toString());

        Person p2 = new Teacher("John", "Sivertsen");
        System.out.println(p2.toString());
    }
}
