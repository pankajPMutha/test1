package com.demo;

import java.io.File;

public class A {
    public static void main(String[] args) {
        File f = new File("G://feb//A.txt");
        long val = f.length();
        System.out.println(val);

    }
}
