package Recursion;

public class BinarySearchRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78, 88, 90, 92, 99};
        int target = 120;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = (s+e)/2;
        if(target == arr[m]){
            return m;
        }
        if (target < arr[m]){
            return search(arr, target, s , m-1);
        }
        return search(arr, target, m+1 , e);
    }
}
