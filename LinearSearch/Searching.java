package LinearSearch;
import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,3,2,3,4,55,6,78,65};
        int target = 776;
        int result = linearSearch(numbers, target);
        System.out.println(result);
    }
    static int linearSearch(int[] arr, int target){

        //forEach
        for (int element : arr){
            if (element == target){
                int res = arr[element];
                return res;
            }
        }

        //For loop
//        for (int i=0; i < arr.length; i++){
//            if(arr[i] == target){
//                return i;
//            }
//        }
        return -1;
    }
}
