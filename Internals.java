package CIE;

public class Internals extends Student {
    int[] marks = new int[5];

    public Internals(String usn, String name, String sem, int[] marks) {
        super(usn, name, sem);
        System.arraycopy(marks, 0, this.marks, 0, 5); // Copies all 5 elements at once
        System.out.println("CIE MARKS ------" +
            "\nS1 : " + this.marks[0] +
            "\nS2 : " + this.marks[1] +
            "\nS3 : " + this.marks[2] +
            "\nS4 : " + this.marks[3] +
            "\nS5 : " + this.marks[4]);
    }
}
 
