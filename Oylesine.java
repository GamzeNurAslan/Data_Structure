package com.mycompany.oylesine;
import java.util.Stack;

public class Oylesine {
    public static String degistir(String str) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        StringBuilder revers = new StringBuilder();
        while (!st.isEmpty()) {
            revers.append(stack.pop());  
        }
        return revers.toString();
    }
    
    public static void main(String[] args) {
        String kelime = "gamze";
        
        String revers = reverseString(kelime);
        
        System.out.println("Orijinal: " + kelime);
        System.out.println("Değiştirilmiş: " + revers);
    }
}
