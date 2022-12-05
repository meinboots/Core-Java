package Object_Oriented_Programming.SingletonClass;

public class AnotherClass {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        //All above reference variable pointing to the same object
    }
}
