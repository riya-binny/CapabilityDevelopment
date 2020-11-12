package Data_Structures;

import java.util.ArrayList;
import java.util.HashMap;

public class StringManipulation {
    public HashMap<Character, Integer> getHashMap(String input) {
        input = input.toLowerCase();
        HashMap<Character, Integer> duplicateHashMap= new HashMap<>();
        for (int i =0; i< input.length(); i++) {
            Character key = input.charAt(i);
            if(duplicateHashMap.containsKey(key))
                duplicateHashMap.put(key, duplicateHashMap.get(key)+1);
            else
                duplicateHashMap.put(key, 1);
        }
        return duplicateHashMap;
    }

    public ArrayList<Character> duplicate(String input){
        ArrayList<Character> duplicateCharacters = new ArrayList<>();
        HashMap<Character, Integer> duplicateHashMap = getHashMap(input);
        duplicateHashMap.forEach((key, value)-> {
            if(value>1)
                duplicateCharacters.add(key);
        });
        return duplicateCharacters;
    }

    public Character firstUnique(String input) {
        HashMap<Character, Integer> duplicateHashMap = getHashMap(input);
        for(int i=0; i<input.length();i++) {
            Character key = input.charAt(i);
            if(duplicateHashMap.get(key)==1)
                return key;
        }
        return null;
    }
}
