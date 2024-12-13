import java.util.Scanner;

class Student1 {
    String name;
    String USN;
    int[] marks = new int[3];
    int[] credits = new int[3];
    int totalCredits = 0;
    int totalMarks = 0;

    Student1(String name, String USN) {
        this.name = name;
        this.USN = USN;
    }

    void setMarks(int subjects) {
        Scanner input1 = new Scanner(System.in);
        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter Subject " + (i + 1) + " Marks and Credits:");
            marks[i] = input1.nextInt();
            credits[i] = input1.nextInt();
            totalMarks += marks[i];
            totalCredits += credits[i];
        }
        // Calculate average
        double average = totalMarks / (double) subjects;
        System.out.println("Average Marks: " + average);
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student USN: " + this.USN);
    }
}

public class Student {
    public static void main(String[] args) {
        System.out.println("How many students do you want to enter?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();  // Consume the newline character after nextInt()

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Student Name:");
            String s1 = input.nextLine();
            System.out.println("Enter Student USN:");
            String s2 = input.nextLine();

            Student1 o = new Student1(s1, s2);
            System.out.println("Enter number of subjects:");
            int n1 = input.nextInt();
            input.nextLine();  // Consume the newline character after nextInt()
            o.setMarks(n1);
        }

        input.close(); // Close the scanner
    }
}
