abstract class Shape{
    int a;
    int b;
    public Shape(int a,int b){
        this.a =a;
        this.b =b;
    }
    public abstract void printArea();
}
class Triangle extends Shape{
    public Triangle(int base,int height){
        super(base,height);
    }
    
    public void printArea(){
        System.out.println("Area of the Triangle "+this.a*this.b*0.5);
    }
}
class Rectangle extends Shape{
    public Rectangle(int breadth,int lenght){
        super(breadth,lenght);
    }
    
    public void printArea(){
        System.out.println("Area of the Rectangle "+this.a*this.b);
    }
}
class Circle extends Shape{
    public Circle(int radius){
        super(radius,0);
    }
    
    public void printArea(){
        System.out.println("Area of the Circle "+this.a*this.a*3.14);
    }
}
public class Area{
    public static void main(String... args){
        Rectangle r = new Rectangle(2,4);
        r.printArea();
        Triangle t = new Triangle(2,5);
        t.printArea();
        Circle c= new Circle(5);
        c.printArea();
    }
}