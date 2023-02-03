package org.example;

public class Palindrome {

    public void isPalindrome(String word){
        String backwards = "";

        String[] letters = word.split("");
        for(int i = letters.length - 1; i >= 0; i--){
            backwards += letters[i];

        }

        if(word.equals(backwards)){
            System.out.println(word + " is a palindrome word");
        }
        else {
            System.out.println(word + " is not a palindrome word");
        }
    }
}
