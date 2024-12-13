class AgeException extends RuntimeException{
    AgeException(String msg){
    super(msg);
    }
}
class Father{
    int age;
    Father(int age) throws AgeException{
        if (age<=0) throw new AgeException("Age should be greater than zero");
        else{
            this.age=age;
            System.out.println("Father age is "+this.age);
}
}
}
class Son extends Father{
    
    Son(int Fage,int Sage)throws AgeException{
    super(Fage);
    if(Sage>=Fage) throw new AgeException("Father age should be greater than Son age");
    System.out.println("Father age is "+ Fage+ " and Son age is "+Sage);
}
}
public class Main{
    public static void main(String[] args){
        try{
            
            Son son1 =new Son(23,25);

       }
       catch(Exception e){
           System.out.println(e);
           
}
}
}

        
        
        
        

