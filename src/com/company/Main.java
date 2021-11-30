package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Random random = new Random();
    String code = String.format("%04d", random.nextInt(10000));
        System.out.println(code);
    }
}
