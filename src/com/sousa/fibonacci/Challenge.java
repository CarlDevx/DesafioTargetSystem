package com.sousa.fibonacci;
import java.util.ArrayList;

public class Challenge{
    void fibonnaci(int desiredNumber){
        boolean checkNumber = false;
        ArrayList<Integer> fibonnaciSequence = new ArrayList<Integer>();
        fibonnaciSequence.add(0);
        
        while (checkNumber != true){
            if (fibonnaciSequence.getLast() == 0){
                fibonnaciSequence.add(1);
            }
            else{
                fibonnaciSequence.add(
                    (fibonnaciSequence.getLast()
                     + fibonnaciSequence.get(fibonnaciSequence.size() - 2)));
                if (fibonnaciSequence.getLast() == desiredNumber) {
                    System.out.println("o numero "+ desiredNumber + " esta na sequencia de fibonnaci, acompanhe a sequencia abaixo.");
                    checkNumber = !checkNumber;
                }
                else{
                    if(fibonnaciSequence.getLast() > desiredNumber){
                        System.out.println("o numero " + desiredNumber + " NAO esta na sequencia de fibonnaci.");
                        checkNumber = !checkNumber;
                    }
                }
            }
        }
        for (int i=0; i < fibonnaciSequence.size(); i++){
            System.out.println(fibonnaciSequence.get(i));
        }
    }
}