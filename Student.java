package CIE;

public class Student {
    String usn;
    String name;
    String sem;

    public Student(String usn, String name, String sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
        System.out.println("NAME :" + this.name + "\nUSN : " + this.usn + "\nsem: " + this.sem);
    }
}
