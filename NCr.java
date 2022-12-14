package com.mycompany.ncr;

import java.util.Scanner;

public class NCr {

    public static void main(String[] args) {

        int n, r, ncr, factn = 1, factsub = 1, factr = 1, nCr, nPr, i = 1, sub;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Value of n: ");
        n = s.nextInt();
        System.out.print("Enter the Value of r: ");
        r = s.nextInt();
        if (n > r) {//condotion to find nCr ,nBr
            while (i <= n) { //find factorial of n
                factn = factn * i;
                i++;
            }
            sub = n - r;
            factsub = 1;
            i = 1;
            while (i <= sub) {//find factorial of n-r
                factsub = factsub * i;
                i++;
            }
            factr = 1;
            i = 1;
            while (i <= r) {//find factorial of r
                factr = factr * i;
                i++;
            }
            nCr = factn / (factr * factsub); // n!(r!(n-r)!)
            System.out.println("\nnCr = " + nCr);
            nPr = factn / factsub;//n!/(n-r)!
            System.out.println("\nnPr = " + nPr);
        } else {
            System.out.println("n value must be greater than r value");
        }
    }
}
