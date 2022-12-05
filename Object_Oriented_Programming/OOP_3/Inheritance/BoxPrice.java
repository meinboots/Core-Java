package Object_Oriented_Programming.OOP_3.Inheritance;

public class BoxPrice extends BoxWeight{
    int cost;

//    static void greeting() {
//        System.out.println("Hey, I am in BoxPrice class. Greetings!");
//    }

    static void greetingBoxPrice() {
        System.out.println("Hey, I am in Box class. Greetings! + Exp + BoxPrice");
    }

    void greetingBoxPrice01() {
        System.out.println("Hey, I am in Box class. Greetings! + Exp + BoxPrice");
    }

    BoxPrice(){
        super();
        this.cost = 1;
    }

    public BoxPrice(int cost) {
        this.cost = cost;
    }

    public BoxPrice(int weight, int cost) {
        super(weight);
        this.cost = cost;
    }

    public BoxPrice(int len, int wid, int hei, int weight, int cost) {
        super(len, wid, hei, weight);
        this.cost = cost;
    }

    public BoxPrice(int side, int weight, int cost) {
        super(side, weight);
        this.cost = cost;
    }

    public BoxPrice(Box other, int weight, int cost) {
        super(other, weight);
        this.cost = cost;
    }
}
