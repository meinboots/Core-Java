package Object_Oriented_Programming.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    //To string method for the class
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    //Constructor for init the CustomArrayList
    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    //Add data to thr array
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    //If CustomArrayList is full create a new array of double size and copy all the elements from the previous one.
    private void resize(){
        if (isFull()){
            int[] temp =  new int[data.length *2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    //Check if it's full
    private Boolean isFull(){
        return size == data.length; // Will return true or false
    }

    //Get Integer value
    public int get(int index){
        return data[index];
    }

    //Get String value
    public void  getString(int index){

        System.out.println("Your element is : " + this.data[index] + ", for index : " +index);

    }

    //Remove value from the CustomArrayList
    public int remove() {
        int removed = data[--size]; // Removing last index value
        return removed;
    }

}
