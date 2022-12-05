package Object_Oriented_Programming.OOP_3.Polymorphism;

public class ObjectPrint {
    int num;
    String name;

    public ObjectPrint(int num) {
        this.num = num;
    }
    public ObjectPrint(String name) {
        this.name = name;
    }

    public ObjectPrint(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj1 = new ObjectPrint(23);
        ObjectPrint obj2 = new ObjectPrint(11,"Yogesh");
        ObjectPrint obj3 = new ObjectPrint("Yogesh");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
