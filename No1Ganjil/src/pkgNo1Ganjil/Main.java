package pkgNo1Ganjil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Input bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.print("Input bilangan ketiga: ");
        int bil3 = input.nextInt();

        int tambah = bil1 + bil2 + bil3;
        int kurang = bil1 - bil2 - bil3;
        int kali = bil1 * bil2 * bil3;
        double bagi = (double) bil1 / bil2 / bil3;

        System.out.println("Hasil penjumlahan: " + tambah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);

        input.close();
    }
}
