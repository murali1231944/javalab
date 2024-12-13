import java.util.Scanner;
class Book{
    private String name;
    private String author;
    private int num_pages;
    private int price;
    public Book(String name,String author,int price,int num_pages){
        this.name =name;
        this.author =author;
        this.price =price;
        this.num_pages=num_pages;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAuthor(String author){
        this.author =author;
    }
    public void setPrice(int price){
        this.price =price;
    }
    public void setName(int num_pages){
        this.num_pages =num_pages;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public int getNumPages(){
        return this.num_pages;
    }
    public String  toString(){
        return "Name= "+this.name+" Author= "+this.author+" Price= "+this.price+" Numpages= "+this.num_pages;
}
}
public class BookInform{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of books");
        int n= sc.nextInt();
        sc.nextLine();
        Book[] book=new Book[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter book name");
            String name=sc.nextLine();
            System.out.println("Enter author name");
            String author =sc.nextLine();
            System.out.println("Enter Price");
            int price = sc.nextInt();
            System.out.println("Enter no of book pages");
            int pages =sc.nextInt();
            book[i]=new Book(name,author,price,pages);
           sc.nextLine();

        }
        for (int i=0;i<n;i++){
            System.out.println(book[i].toString());
        }
   }    
}     

         


    