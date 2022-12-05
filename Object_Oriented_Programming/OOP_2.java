package Object_Oriented_Programming;

//  packages,
//  import statement,
//  static keyword,
//  static block,
//  inner classes,

public class OOP_2 {

    static int a = 4;
    static int b;

    static{
        System.out.println("I am in static block : ");
        b = a * 5;
    }

    public static void main(String[] args) {

        //First time creating object
        OOP_2 obj1 = new OOP_2();
        System.out.println("a : " +OOP_2.a + " | " + "b : "+ OOP_2.b);
        System.out.println();

            OOP_2.b+=3;
        System.out.println("a : " +OOP_2.a + " | " + "b : "+ OOP_2.b);

        System.out.println();

        //Second time creating object
        OOP_2 obj2 = new OOP_2();
        System.out.println("a : " +OOP_2.a + " | " + "b : "+ OOP_2.b);


    }
}
