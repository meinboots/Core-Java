package Object_Oriented_Programming;

public class InnerClasses {

    static class Test{
         String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Test a = new Test("Yogesh");
        Test b = new Test("Kevin");

        //System.out.println(Test.name);
        System.out.println(a.name);
        System.out.println(b.name);



    }
}
