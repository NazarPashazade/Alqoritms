package STACK_;

import java.util.Stack;

public class Stack_ {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        System.out.println("stack       = " + stack);
        System.out.println("stack.pop() = " + stack.pop());// en son( ustdeki ) elementi silir ve silineni geri qaytarir
        System.out.println("stack.pop() = " + stack.pop());// en son( ustdeki ) elementi silir ve silineni geri qaytarir
        System.out.println("stack.pop() = " + stack.pop());// en son( ustdeki ) elementi silir ve silineni geri qaytarir
        System.out.println("stack       = " + stack);
    }
}
