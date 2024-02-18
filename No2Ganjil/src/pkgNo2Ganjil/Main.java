package pkgNo2Ganjil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang Anda: ");
        int uang = scanner.nextInt();

        System.out.print("Apakah sedang hujan? (true/false): ");
        boolean hujan = scanner.nextBoolean();

        if (uang > 5000 && !hujan) {
            System.out.println("Anda bisa membeli gorengan.");
        } else {
            System.out.println("Anda tidak bisa membeli gorengan.");
        }

        scanner.close();
    }
}
