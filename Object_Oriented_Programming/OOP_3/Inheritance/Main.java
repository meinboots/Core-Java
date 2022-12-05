package Object_Oriented_Programming.OOP_3.Inheritance;

public class Main {
    public static void main(String[] args) {
        //Box
        //Box box1 = new Box();
        //Box box2 = new Box(23,45,66);
        //Box box3 = new Box(32);
        //Box box4 = new Box(box1);

        //Box boxCandidates = new Box();
        //BoxWeight boxWeightCandidates = new BoxWeight();

        //Candidates for new BoxWeight() are:
//        BoxWeight()
//        BoxWeight(int weight)
//        BoxWeight(int len, int wid, int hei, int weight)
//        BoxWeight(int side, int weight)
//        BoxWeight(Box other, int weight)

         //Candidates foe new Box() are:
//         Box()
//         Box(int len, int wid, int hei)
//         Box(int side)
//         Box(Box other)

         //Candidates foe new BoxWeight() are :
 //        BoxWeight()
 //        BoxWeight(int weight)
 //        BoxWeight(int len, int wid, int hei, int weight)
 //        BoxWeight(int side, int weight)
 //        BoxWeight(Box other, int weight)

//        System.out.println("Length : " + box1.length + " | " + "Width : " +box1.width + " | "+"Height : " +box1.height);
//
//        System.out.println("Length : " + box2.length + " | " + "Width : " +box2.width + " | "+"Height : " +box2.height);
//
//        System.out.println("Length : " + box3.length + " | " + "Width : " +box3.width + " | "+"Height : " +box3.height);
//
//        System.out.println("Length : " + box4.length + " | " + "Width : " +box4.width + " | "+"Height : " +box4.height);

        //BoxWeight
        //BoxWeight box5 = new BoxWeight(box2, 35);
        //BoxWeight box6 = new BoxWeight(54, 35);

        //System.out.println("Length : " + box5.length + " | " + "Width : " +box5.width +
        // " | "+"Height : " +box5.height +" | "+"Weight : " +box5.weight);

//        System.out.println("Length : " + box6.length + " | " + "Width : " +box6.width +
//                " | "+"Height : " +box6.height +" | "+"Weight : " +box6.weight);

        //Reference parent class to child class // Not allowed

        //Box box7 =  new BoxWeight();
        //Box box8 =  new BoxWeight();
//      BoxWeight box10 =  new Box(4); // Can Not do it.

        //Candidates foe new BoxWeight();
//        BoxWeight()   BoxWeight(int weight)
//        BoxWeight(int len, int wid, int hei, int weight)
//        BoxWeight(int side, int weight)
//        BoxWeight(Box other, int weight)


//        System.out.println("Length : " + box7.length + " | " + "Width : " +box7.width +
//                " | "+"Height : " +box7.height); //"Weight : " +box7.weight -> here weight will not be accessible with reference var box7 witch is the object of box class.

        //Methods
//        Box.greeting();
//
//        //BoxWeight box = new BoxWeight();
//        BoxWeight.greeting(); // you can inherit but you cannot override
//
//        BoxPrice.greeting();

        //BoxPrice

        //BoxPrice box9 = new BoxPrice();
//        System.out.println(box9.cost + " cost");
//        System.out.println(box9.height + " height");
//        System.out.println(box9.length + " length");
//        System.out.println(box9.width + " width");
//        System.out.println(box9.weight + " weight");


//            public BoxPrice(int len, int wid, int hei, int weight, int cost) {
//            super(len, wid, hei, weight);
//            this.cost = cost;

//        BoxPrice box10 = new BoxPrice(32,56,43,65,43);
//        System.out.println(box10.cost + " cost");
//        System.out.println(box10.height + " height");
//        System.out.println(box10.length + " length");
//        System.out.println(box10.width + " width");
//        System.out.println(box10.weight + " weight");

        //For Functions :

//        Box.greeting();
//        BoxWeight.greeting();
//        BoxPrice.greeting();

        System.out.println();

        BoxPrice.greetingBox();
        BoxPrice.greetingBoxWeight();
//      BoxWeight.greeting();

        //What if those methods are not static

        BoxPrice greet = new BoxPrice();
        //System.out.println(greet.height);
        System.out.println();
        greet.greetingBoxPrice01();

        }
    }
