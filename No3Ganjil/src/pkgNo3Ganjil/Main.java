package pkgNo3Ganjil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter pertama: ");
        char karakter1 = scanner.next().charAt(0);

        System.out.print("Masukkan karakter kedua: ");
        char karakter2 = scanner.next().charAt(0);

        int ascii1 = (int) karakter1;
        int ascii2 = (int) karakter2;
        int totalAscii = ascii1 + ascii2;

        System.out.println("Total ASCII dari " + karakter1 + " dan " + karakter2 + " adalah: " + totalAscii);
    }
}
