package Practise;

import java.util.ArrayList;

public class CheckUnique {
    public static boolean isUnique(String s) {
        if(s.length() > 256) return false;

        boolean[] char_set = new boolean[256];
        for(int i=0; i<s.length();i++) {
            int a = s.charAt(i);
            if(char_set[a]) {
                return false;
            }
            char_set[a] = true;
        }
        return true;
    }

    public static boolean isUniqueList(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            if(arrayList.contains(s.charAt(i))){
                return false;
            }
            arrayList.add(s.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueList("helo"));
    }
}
