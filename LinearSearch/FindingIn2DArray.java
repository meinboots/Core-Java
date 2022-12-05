package LinearSearch;

public class FindingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1, -2},
                {18, 12, 3, 9,766676},
                {78, 99, 34, 56},
                {18, 12, 454,6464}
        };
//        int target = 56;
//        int[] ans = search(arr,target); // format of return value {row, col}
//        System.out.println(Arrays.toString(ans));

        //Max Value
        int ans = maxValue(arr);
        System.out.println("Maximum Value : "+ans);

        //Max Value
        int res = minValue(arr);
        System.out.println("Minimum Value : "+res);
    }
    //Finding in array
    static int[] search(int[][] arr , int target){
        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target ){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //Finding max number in array
    static int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > max ){
                    max = arr[row][col];
                }

            }
        }

        return max;
    }

    //Finding min number in array
    static int minValue(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] < min ){
                    min = arr[row][col];
                }

            }
        }

        return min;
    }
}
