package Object_Oriented_Programming.OOP_3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am main method : ");

        System.out.println();

        Shape calc1 =  new Circle();
        calc1.area(); // if we reference child class method via base class then will use child class method.
        //But that method should be present in base class as well.

        //Try to have look if can we access peer classes if they have same parent class.
        //No we can not do that, at any cost.



    }
}
