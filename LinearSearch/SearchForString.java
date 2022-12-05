package LinearSearch;

public class SearchForString {
    public static void main(String[] args) {

        String name = "Yogesh";
        char target = 'o';
        System.out.println(searchCharInStr(name, target));
    }
    static Boolean searchCharInStr(String str, char target){
        for (int i= 0; i< str.length(); i++){
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
