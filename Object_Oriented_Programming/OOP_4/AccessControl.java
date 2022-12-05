package Object_Oriented_Programming.OOP_4;
import java.util.Arrays;

//Here we will discuss all access modifiers;

public class AccessControl {
    public int num = 10;
    public String name = "Kevin";
    protected int[] arr = new int[2];
    //public String[] array = new String[1];


    public AccessControl() {
        this.arr[0] = 99;
        this.arr[1] = 98;
    }

     protected static String greeting(){
        //System.out.println("Hi there I a method from 'AccessControl Class', Hence My papa is there, not in here : I am crying");
        return "Hi there I a method from 'AccessControl Class', Hence My papa is there, not in here : I am crying : static";
    }
    protected void greetings(){
        System.out.println("Hi there I a method from 'AccessControl Class', Hence My papa is there, not in here : I am crying : non-static");
        //return "Hi there I a method from 'AccessControl Class', Hence My papa is there, not in here : I am crying";
    }

    public static void main(String[] args) {
        System.out.println("Nothing to do with it : ");
        AccessControl data = new AccessControl();
        //int[] arr = {12,34};
        //System.out.println(arr[1]);

        //want to set values
        //int[] nums = new int[2];
        data.arr[0] = 12;
        data.arr[1] = 21;


        System.out.println(Arrays.toString(data.arr));
    }
}
