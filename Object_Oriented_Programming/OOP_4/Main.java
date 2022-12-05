package Object_Oriented_Programming.OOP_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AccessControl data = new AccessControl();
        data.arr[0] = 102;
        data.arr[1] = 110;
        System.out.println(Arrays.toString(data.arr));
    }
}
