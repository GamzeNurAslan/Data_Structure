package com.mycompany.oylesine;
        import java.util.Stack;

public class Oylesine {
    
    // Fonksiyon: Stack kullanarak kelimeyi ters çevir
    public static String reverseString(String str) {
        // Stack oluştur
        Stack<Character> stack = new Stack<>();
        
        // String'in her bir karakterini Stack'e ekle
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        
        // Ters çevrilmiş kelimeyi oluştur
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());  // Stack'ten karakter çıkar ve ekle
        }
        
        return reversedStr.toString();
    }
    
    public static void main(String[] args) {
        // Ters çevrilecek kelime
        String word = "hello";
        
        // Kelimeyi ters çevir
        String reversedWord = reverseString(word);
        
        // Sonucu yazdır
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversedWord);
    }
}
