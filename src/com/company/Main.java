package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numArr = new int[4];
        String bunarySt = Integer.toBinaryString(0);;
        for (int i = 0;i<numArr.length-1;i++ ){
            numArr[i]= (int) (Math.random()*100);
            System.out.println(numArr[i]);
        }

        System.out.println(bunarySt);


    }
}
