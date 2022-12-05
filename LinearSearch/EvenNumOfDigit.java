package LinearSearch;

public class EvenNumOfDigit {
    public static void main(String[] args) {
        //Number of digits :
        int ans = findDigits(143443);
        System.out.println(ans);

        //isEven :
        Boolean isEven = isEven(99);
        System.out.println(isEven);

        //findNumbers checking :
        int[] nums = {123,23, 7648, 3,45,6777,889};
        int result = findNumbers(nums);
        System.out.println("Even Number of Digits : " + result);

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int number :  nums){
            if (isEven(number)){
                count++;
            }
        }
        return count;
    }

    static Boolean isEven(int number){
        if(findDigits(number) % 2 == 0){
            return true;
        }
        return false;
    }
    static int findDigits(int number){
        int count = 0;
        while(number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
