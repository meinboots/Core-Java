package Object_Oriented_Programming.SingletonClass;
//If it is a singleton class means its constructor should not be accessible outside the class : hence we make it private
//And will create a function to provide the object to outside the classes.
//Object will be only one instance.
public class Singleton {
    static Singleton instance; // Variable declaration for instance

    static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(); // Instance Creating
        }
        return instance;
    }

//    public static void main(String[] args) {
//        System.out.println(instance);
//    }

}
