package Object_Oriented_Programming.OOP_3.Inheritance;

//        Inheritance,
//        Super keyword,
//        Types of Inheritance,
//        Polymorphism,
//        Dynamic method dispatch,
//        toString method,
//        final keyword to prevent @overriding,
//        early binding & late binding,
//        when put a class final implicitly it makes all methods final as well,
//        Overriding depends on objects & static stuff does not depend on objects hence you can't override static stuff(methods),
//        Overloading and overriding does not apply to instance variables,

public class Box {
    int length;
    int width;
    int height;

//    static void greeting() {
//        System.out.println("Hey, I am in Box class. Greetings!");
//    }

    static void greetingBox() {
        System.out.println("Hey, I am in Box class. Greetings! + Exp + Box");
    }

    void greetingBox01() {
        System.out.println("Hey, I am in Box class. Greetings! + Exp + Box");
    }

    Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    //For setting all values at the time of object making.
    Box(int len, int wid, int hei){
        this.length = len;
        this.width = wid;
        this.height = hei;
    }

    //For Square
    Box(int side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    //Object will set values with another object
    Box( Box other){
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

}
