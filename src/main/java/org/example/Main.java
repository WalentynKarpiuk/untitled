package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Podaj czas do wybuchu");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for (int j = i; j >=0 ; j--) {
            System.out.println("Launch for:" + j);
            Thread.sleep(500);
        }

    }
    // This step is need for creating new branch lesson 1

}