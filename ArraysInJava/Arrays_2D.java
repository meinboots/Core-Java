package ArraysInJava;
import java.util.*;
import java.util.Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        //Declaim an 2D Array and fill values by user :

        Scanner in = new Scanner(System.in);

        int [][] nums = new int[3][3]; // Here it is not compulsory to define array col length

        System.out.println("Enter the Numbers : ");

        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col< nums[row].length; col++){
                nums[row][col] = in.nextInt();
            }
        }
        //Output
                for (int row = 0; row < nums.length; row++) {
            System.out.println(Arrays.toString(nums[row]));
        }

        System.out.println();//For a line
        System.out.println();//For a line

        //Output
        for (int[] arr : nums){
            System.out.println(Arrays.toString(arr));
        }



        //Manually did it :
//        System.out.println("2D Arrays");
//        int[][] numbers = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        for (int i=0; i< numbers.length; i++){
//            for (int  j =0; j<numbers[i].length; j++) {
//                //System.out.println(numbers[i][j]);
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
