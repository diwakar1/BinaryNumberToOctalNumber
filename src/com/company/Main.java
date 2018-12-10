package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int biNumber;
        int deciNumber=0;
        int remainder;
        int i=1;
        int j;
        int biNumber1;
        int quot;
        int []octalNum= new int[50];



        Scanner in= new Scanner(System.in);
        System.out.println("Enter binumber: ");
        biNumber=in.nextInt();
        biNumber1=biNumber;

        while(biNumber>0){
            remainder=biNumber%10;
            biNumber=biNumber/10;
            deciNumber=deciNumber+remainder*i;
            i=i*2;

        }
        i=1;
        quot= deciNumber;
        while(quot>0){
            octalNum [i++]= quot%8;
            quot= quot/8;
        }
        System.out.print("Equivalent of binunber's octal num is "+ biNumber1+ " is ");
        for( j= i-1;j>0;j--){

            System.out.print(octalNum[j]);

        }


// other way to do
        String binumber="101";
        int oct= Integer.parseInt(binumber,2);
        String octal= Integer.toOctalString(oct);
        System.out.println("\n The equivalent octal of binury Number "+binumber+" is "+ octal );

    }



}
