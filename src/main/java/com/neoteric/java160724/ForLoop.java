package com.neoteric.java160724;

public class ForLoop {
    public int  sum(int numberOfNotes, int currencyValue){
        int sum=0;
        for (int count=1; count<=numberOfNotes;count++){
            sum=sum+currencyValue;


        }
        return sum;
    }

}
