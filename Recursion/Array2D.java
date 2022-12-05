package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
//        int[][] numbers = {
//                {13, 45 ,77},
//                {5 ,6 ,7},
//                {2 ,4 ,7}
//        };
        Scanner in = new Scanner(System.in);
        int [][] numbers =  new int[3][3]; // here it is not required to give col values every time
        System.out.println(" Enter Nums : ");
        //Input
        for (int row = 0; row < numbers.length; row++ ){
            for (int col = 0 ; col < numbers[row].length ; col ++){
                numbers[row][col] =  in.nextInt();
            }
        }

        //output

//        for (int row = 0; row < numbers.length; row++ ){
//            for (int col = 0 ; col < numbers[row].length ; col ++){
//                System.out.print(" "+numbers[row][col]);
//            }
//            System.out.println();
//        }

        //for each

        for(int [] arr : numbers){
            System.out.println(Arrays.toString(arr));
        }

    }

}
