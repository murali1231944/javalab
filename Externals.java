import CIE.Student;
public class Externals extends Student{
  int[] marks=new int[5];
    public Externals(String usn,String name,String sem,int[] marks){
        super(usn,name,sem);
        this.marks[0]=marks[0];
        System.out.println("SEE MARKS ------"+
        "\nS1 : "+this.marks[0]+
        "\nS2 : "+this.marks[1]+
        "\nS3 : "+this.marks[2]+
        "\nS4 : "+this.marks[3]+
        "\nS5 : "+this.marks[4]);
    }
}

