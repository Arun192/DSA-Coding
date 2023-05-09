package in.arun.dsa.linearsearch;

public class SearchInString {

    public static void main(String[] args) {
        String str = "Arun".toLowerCase();
        char target = 'u';
        //System.out.println(search(str, target));
        System.out.println(search2(str, target));
    }

//    private static boolean search(String str, char target) {
//
//        if (str.length()==0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target ==str.charAt(i)){
//
//                return true;
//            }
//        }
//        return false;
//    }

    private static boolean search2(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
