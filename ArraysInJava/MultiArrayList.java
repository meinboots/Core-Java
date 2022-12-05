package ArraysInJava;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> listJumbo =  new ArrayList<>(10);

        // initialisation
        for (int i = 0; i< 3; i++){
            listJumbo.add(new ArrayList<>());
        }


        // add elements
        System.out.println("Enter values : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                listJumbo.get(i).add(in.nextInt());
            }
        }

        System.out.println(listJumbo);

    }
}
