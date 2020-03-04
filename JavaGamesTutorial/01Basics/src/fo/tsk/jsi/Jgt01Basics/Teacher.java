package fo.tsk.jsi.Jgt01Basics;

public class Teacher extends Person {
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Harra " + FirstName + " " + LastName;
    }
}
