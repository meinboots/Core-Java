package ForAccessTesting;

import Object_Oriented_Programming.OOP_4.AccessControl;

import java.util.Arrays;

public class AnotherSubClass extends AccessControl{
    //AccessControl data = new AccessControl();

    public static void main(String[] args) {
        AccessControl data = new AccessControl();
        System.out.println(data.num);
        System.out.println(data.name);

//        data.arr[0] = 12;
//        data.arr[1] = 56;
//        System.out.println(Arrays.toString(data.arr));

        AnotherSubClass info = new AnotherSubClass();
        System.out.println(Arrays.toString(info.arr));

        System.out.println();

        info.greeting();


    }
}
