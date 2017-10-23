package com.maghi711.javase8;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main(String[] args) {

        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        FileFilter lambdaFilter = (File file) -> file.getName().endsWith(".java");

        File dir = new File("/tmp");
        //File[] files = dir.listFiles(fileFilter);
        File[] files = dir.listFiles(lambdaFilter);
        for (File f: files) {
            System.out.println("filtered file = " + f.getName());
        }
    }
}
