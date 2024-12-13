import java.util.Scanner;

interface Polygon {
    Scanner sc = new Scanner(System.in);

    void getArea();

    default void getPerimeter() {
        System.out.println("Enter the size and enter the length");
        int size = sc.nextInt();
        int length = sc.nextInt();
        System.out.println("Perimeter: " + size * length);
    }
}

class Square implements Polygon {
    int size;
    int length;

    Square(int size, int length) {
        this.size = size;
        this.length = length;
    }

   
    public void getArea() {
        System.out.println("AREA: " + length * length);
    }

    
    public void getPerimeter() {
        System.out.println("Perimeter: " + 4 * length);
    }
}

class Hexagon implements Polygon {
    int size;
    int length;

    Hexagon(int size, int length) {
        this.size = size;
        this.length = length;
    }


    public void getArea() {
        System.out.println("AREA: " + (3 * Math.sqrt(3) * length * length) / 2);
    }

    
    public void getPerimeter() {
        System.out.println("Perimeter: " + 6 * length);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Polygon p = new Square(4, 7);
        p.getArea();
        p.getPerimeter();

        Polygon p1 = new Hexagon(5, 9);
        p1.getArea();
        p1.getPerimeter();
    }
}
