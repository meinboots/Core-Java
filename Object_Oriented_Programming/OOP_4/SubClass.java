package Object_Oriented_Programming.OOP_4;

public class SubClass extends AccessControl{

//    AccessControl data =  new AccessControl();
//    data.greeting();

//    SubClass info = new AccessControl();
//    data.greeting();


    static String greeting = AccessControl.greeting();

    public static void main(String[] args) {
        SubClass greet = new SubClass();
        System.out.println(greeting);
        System.out.println();
        greet.greetings();

    }

}
