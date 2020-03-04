package fo.tsk.jsi.Jgt01Basics;

public class Person {
    protected String FirstName;
    protected String LastName;

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String toString() {
        return FirstName + " " + LastName;
    }
}
