
import java.util.Scanner;
class InvalidUser extends RuntimeException{
    private static final long serialVersionID=1L;
    InvalidUser(){
        super();
    }
    InvalidUser(String msg){
        super(msg);
    }
    InvalidUser(Throwable throwable){
        super(throwable);
    }
    InvalidUser(String msg,Throwable throwable){
        super(msg,throwable);
    }
}

public class InvalidUserInputExceptionDEmo{
    public static void main(String[] args){
       System.out.println("Type an Integer on the console");
       try{
            System.out.println("You typed "+readFromConsole());
       }
	catch(InvalidUser ex){
            System.out.println("Exception is of type "+ex);
            System.out.println("Original caught exception "+ex.getCause());
}
}
public static int readFromConsole(){
    Scanner sc =new Scanner(System.in);
    int i=0;
    try{
        i=sc.nextInt();
    }
    catch(InvalidUser ex){
        System.out.println("Wrapping Exception and throwing");
        System.out.println();
        throw new InvalidUser("Invalid Integer entered",ex);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return i;
}
}
        
        