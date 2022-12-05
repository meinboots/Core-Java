package Object_Oriented_Programming.Abstraction;

abstract public class AbstractClass {
     public int num = 10;
     String name = "Yogesh";
     protected  static int number = 100;
     protected static String movie_name = "Rango";

     public void greeting(){
         System.out.println("Say hallo + greeting");
     }

     static void greetingStatic(){
         System.out.println("Say hallo + Static + greeting");
     }

     public void printNormal(){

     }

     static void printStatic(){

     }

    public static void main(String[] args){

        //System.out.println("hello from main");

    }

}
