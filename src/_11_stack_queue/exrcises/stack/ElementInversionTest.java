package _11_stack_queue.exrcises.stack;

import java.util.Arrays;
import java.util.Stack;

public class ElementInversionTest {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        int array[] = {1, 2, 3, 4, 5};
        for (int element : array) {
            integerStack.push(element);
        }
        System.out.println(integerStack);
        for (int index = 0; index < array.length; index++) {
            array[index] = integerStack.pop();
        }
        System.out.println(Arrays.toString(array));


        Stack<Character> stringChar = new Stack<>();
        String string = "Codegym";
        char mWord;
        for (int index =0; index<string.length();index ++){
            mWord = string.charAt(index);
            stringChar.push(mWord);
        }
        System.out.println(stringChar);
        mWord=stringChar.pop();
        String newStr = string + mWord;
        System.out.println(newStr);


    }
}

