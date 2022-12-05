package Object_Oriented_Programming.OOP_3.Inheritance;

//Here box is inheriting BoxWeight
public class BoxWeight extends Box {
        int weight;

        //@Override //Super class methods can not be overridden
//        static void greeting() {
//                System.out.println("Hey, I am in BoxWeight class. Greetings!");
//
//        }

        static void greetingBoxWeight() {
                System.out.println("Hey, I am in Box class. Greetings! + Exp + BoxWeight");

        }

        void greetingBoxWeight01() {
                System.out.println("Hey, I am in Box class. Greetings! + Exp + BoxWeight");

        }

        public BoxWeight() {
                this.weight = -1;
        }

        public BoxWeight(int weight) {
                this.weight = weight;
        }

        public BoxWeight(int len, int wid, int hei, int weight) {
                super(len, wid, hei);
                this.weight = weight;
        }

        public BoxWeight(int side, int weight) {
                super(side);
                this.weight = weight;
        }

        public BoxWeight(Box other, int weight) {
                super(other);
                this.weight = weight;
        }
}
