package com.sousa.charfinder;

public class CharFinder {
    public void find(String str){
        int charCounter = 0;
        char[] aLetterVariations = {'A','a'};
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == aLetterVariations[0]
             || str.charAt(i) == aLetterVariations[1]) {
                charCounter++;
            }
        }
        System.out.println("A letra 'A' apareceu "
         + charCounter + " de vezes, seja de forma minuscula ou maiuscula.");
    }
}
