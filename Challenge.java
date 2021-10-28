package com.company;

public class Challenge {
    public static void main (String [] args){

        byte ByteNumber = 100;
        short ShortNumber = 500;
        int IntNumber = 420;
        long myLongNumber= 50000L + 10L * (IntNumber +ByteNumber + ShortNumber);

        System.out.println("The long value = " + myLongNumber);


    }
}
