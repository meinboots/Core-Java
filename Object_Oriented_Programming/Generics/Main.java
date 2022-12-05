package Object_Oriented_Programming.Generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        //Adding values to lists
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add(5);

        //System.out.println(list);

        //System.out.println(list.get(2));

        //Get element by Index
        //list.getString(5);

        //Delete element by index
       int removed =  list.remove();

        System.out.println("removed : " +removed);



    }
}
