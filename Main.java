package ru.vsu.cs.smagina;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter body speed: ");
        int v = scanner.nextInt();

        int g = 10;
        int t = 2 * v / g;

        System.out.printf("flight time: = %d", t);

    }
}
