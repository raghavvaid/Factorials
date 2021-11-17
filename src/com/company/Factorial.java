package com.company;

public class Factorial {

    public static int calcFactorial(int fac){
        int ans = 1;
        for (int x = fac; x > 0; x--){
            ans = x*ans;
        }
        return ans;
    }



    public static void main(String[] args) {
        for (int x = 1; x<=10; x++){
            System.out.println(calcFactorial(x));
        }
    }
}