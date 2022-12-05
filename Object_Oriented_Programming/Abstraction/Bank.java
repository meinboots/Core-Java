package Object_Oriented_Programming.Abstraction;

abstract class Bank{
     abstract int getRateOfInterest();
     static void greeting(){
         System.out.println("I am abstract method from Bank");
     }
}
class SBI extends Bank{
     @Override
    int getRateOfInterest(){
         return 8;
    }

    static  void greeting() {
        System.out.println("Hello from SBI");
    }
}
class PNB extends Bank{
     @Override
    int getRateOfInterest(){
         return 10;
    }
    static void greeting() {
        System.out.println("Hello from PNB");
    }
}

class TestBank{
    public static void main(String args[]){
        Bank b;
        //Here we are overriding Abstract class method, Hence I am able to access both subclass method with only one reference variable.
        b=new SBI();
        System.out.println(b.getRateOfInterest());
        b.greeting();

        System.out.println();

        b=new PNB();
        System.out.println(b.getRateOfInterest());
        b.greeting();

        System.out.println();

        SBI.greeting();
        PNB.greeting();

    }}
