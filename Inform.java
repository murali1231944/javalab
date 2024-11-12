import CIE.*;
import SEE.*;
import java.util.Scanner;
public class Inform{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("no of Students");
      int n=sc.nextInt();
      Internals[] internals=new Internlas[n];
      Externals[] externals =new Externals[n];
      for(int i=0;i<n;i++){
        System.out.println("USN");
        String usn = sc.nextLine();
        System.out.println("NAME");
        String name=sc.nextLine();
        System.out.println("SEM");
        String sem =sc.nextLine();
        System.out.println("Eneter CIE marks");
        int[] Cmarks=new int[5];
        int[] Smarks=new int[5];
        for(int j=0;i<5;i++){
          Cmarks[j]=sc.nextInt();
        }
        System.out.println(" Enter SEE marks");
        for(int j=0;j<5;j++){
            Smarks[j]=sc.nextInt();
        }
        Internals[i]=new Internals(usn,name,sem,Cmarks);
        Externals[i]=new Externals(usn,name,sem,Smarks);
        System.out.println("Final Marks");
        for(int j=0;j<5;j++){
            int final1=Internals[i].Cmarks[j]+Externals[i].Smarks[j];
            System.out.println("Sub"+(i+1)+"marks "+final1);
        }
      }
    }
  }
        