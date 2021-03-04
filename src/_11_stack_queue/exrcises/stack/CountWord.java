package _11_stack_queue.exrcises.stack;

import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String str = "CodeGymcode";
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int index = 0; index < str.length(); index++) {
            int value = 1;
            Character getChar = str.charAt(index);
            Character newChar = getChar.toUpperCase(getChar);
            if (treeMap.containsKey(newChar)){
                int newValue = treeMap.get(newChar) +1;
                treeMap.put(newChar,newValue);
            }else {
                treeMap.put(newChar,value);
            }
        }
        System.out.println(treeMap);
    }
}
