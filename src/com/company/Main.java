package com.company;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        char c2 = 'A';
        byte b;
        float f;
        int i = -500;
        f = 1 + new Random().nextFloat() * (1000000 - 1);
        i = Math.round(f);
        b = (byte)i;
        double y = Math.pow(i, 5) / Math.log(f) - Math.sin(f) / b;

        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("i = " + i);
        System.out.println("y = " + y);
        System.out.println(c2);
        System.out.println();
    }
}

