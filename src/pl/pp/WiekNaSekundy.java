package pl.pp;

import java.util.Scanner;

public class WiekNaSekundy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać swój wiek w latach: ");
        int wiekWLatach = scanner.nextInt();

        long wiekWSekundach = (long) (wiekWLatach * 365.25 * 24 * 60 * 60);

        System.out.println("Twój wiek w sekundach wynosi: "+wiekWSekundach +" sekund.");

        scanner.close();
    }
}