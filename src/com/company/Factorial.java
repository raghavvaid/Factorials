package com.company;

public class Factorial {

    public static long calcFactorial(int fac){
        int ans = 1;
        long x = 1;
        while (fac >= ans){
            x *= ans;
            ans++;
        }
        return x;
    }

    public static double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int frac = 1;
        while (e - olde > .001){
            olde = e;
            e+=1.0/calcFactorial(frac);
            frac++;
        }
        return e;
    }

    public static double calcEX(int n){
        double e = 1.0;
        double olde = 0.0;
        int frac = 1;
        int pwr = 1;
        while (e-olde > .001){
            olde = e;
            e+= Math.pow(n,pwr)/calcFactorial(frac);
            frac++;
            pwr++;
        }
        return e;
    }

    public static void main(String[] args) {
        for (int x = 1; x<=20; x++){
            System.out.println(calcFactorial(x));
        }
        System.out.println(" ");
        System.out.println(calcE());
        System.out.println(" ");
        for (int x = 1; x <=5; x++){
            double e = calcEX(x);
            System.out.printf("e^%d is %2.3f \n", x, e);
        }
    }
}
