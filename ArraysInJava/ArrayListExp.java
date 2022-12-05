package ArraysInJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {
        System.out.println("Here we will go with array list : ");
        System.out.println();
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(10);
        //This is how we manually give values
//        list.add(10);
//        list.add(22);
//        list.add(44);
//        list.add(56);
//        list.add(76);
//        list.add(67);
//        System.out.println(list);


        //Enter Values
        System.out.println("Enter Values : ");
        for (int i = 0; i <= 10; i++){
            list.add(in.nextInt());
        }

        for (int i = 0; i < 10; i++){
            System.out.print (list.get(i) + " ");
        }

    }
}
