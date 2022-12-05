package Experiments;

import Object_Oriented_Programming.Abstraction.AbstractClass;

public class AbstractionExp extends AbstractClass {
    int num = 14;

    protected  static int number = 200;
    protected static String movie_name = "IceAge";

    @Override
    public void greeting() {
        super.greeting();
        System.out.println("Say hallo + greeting + AbstractionExp");
    }

    public static void main(String[] args) {
        AbstractClass obj =  new AbstractionExp();
        AbstractionExp obj1 =  new AbstractionExp();

//        System.out.println(AbstractClass.number);
//        System.out.println(AbstractClass.movie_name);
//
//        System.out.println();
//
//        System.out.println(AbstractionExp.number);
//        System.out.println(AbstractionExp.movie_name);

        System.out.println();

        obj.greeting();
        obj1.greeting();



    }


}
