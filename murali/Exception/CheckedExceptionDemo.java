
class CheckedExceptionDemo{
    public static void main(String[] args){
        try{
               int a= 5/0;
	       System.out.println("not possssible in try");
       }
       catch(ArithmeticException e){
            System.out.println(e.getMessage());
}
}
}
