abstract class Animal{
    protected String type;
    public Animal(String type){
        this.type= type;
    }
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal{
    
    public Lion(String type){
        super(type);
    }
    public void eat(){
        System.out.println(this.getClass().getSimpleName()+" is the parent of "+type);
        System.out.println(this.type+" eats flesh");
    }
    public void sleep(){
        System.out.println(this.type+" sleeps more");
    }
}
class Tiger extends Animal{
    
    public Tiger(String type){
        super(type);
    }
    public void eat(){
        System.out.println(this.getClass().getSimpleName()+" is the parent of "+type);
        System.out.println(this.type+" eats flesh");
    }
    public void sleep(){
        System.out.println(this.type+" sleeps more");
    }
}

class Deer extends Animal{
    
    public Deer(String type){
        super(type);
    }
    public void eat(){
        System.out.println(this.getClass().getSimpleName()+" is the parent of "+type);
        System.out.println(this.type+" eats flesh");
    }
    public void sleep(){
        System.out.println(this.type+" sleeps more");
    }
}
public class AnimalInfo{
    public static void main(String... args){
        Lion l1 = new Lion("Lion hybrid");
        l1.eat();
        l1.sleep();
        Deer d=new Deer("lady");
        d.eat();
        d.sleep();
        Tiger t1 =new Tiger("lady Tiger");
        t1.eat();
        t1.sleep();
    }
}
 