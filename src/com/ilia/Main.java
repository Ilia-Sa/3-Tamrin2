//Ilia Safarian - 40012341054047

package com.ilia;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Solving the equation: (a*x^2 + b*x + c =0)");

        int a, b, c, delta;
        double x1, x2, x;

        System.out.print("Please enter the coefficient of x^2, a : ");
        a = input.nextInt();

        System.out.print("Please enter the coefficient of x, b : ");
        b = input.nextInt();

        System.out.print("Please enter c, c : ");
        c = input.nextInt();

        delta = (b * b) - (4 * a * c);

        if (delta > 0) {

            x1 = (-b + Math.sqrt((double) delta)) / (2 * a);
            x2 = (-b - Math.sqrt((double) delta)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

        }

        else if (delta == 0){

            x = (-b / (2 * a));

        }

        else if (delta < 0){

            throw new ArithmeticException("The equations is invalid");

        }
        }
    }