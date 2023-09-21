package TugasPekan2;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        System.out.println("Nama    : Syahid Jundulloh");
        System.out.println("NIM     : C2183207011");
        System.out.println("Prodi   : Pendidikan Teknologi Informasi 21A");
        
        System.out.println("----------------------------------");
        
        try (
            Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            int angka2 = input.nextInt();
            int hasiljumlah = angka1 + angka2;
            int hasilkurang = angka1 - angka2;
            int hasilkali = angka1 * angka2;
            int hasilbagi = 0;
            if (angka2 != 0) {
                hasilbagi = angka1 / angka2;
            } else {
                System.out.println("Pembagian oleh nol tidak dapat dilakukan.");
            }   // Menampilkan hasil operasi
            System.out.println("Hasil penjumlahan: " + hasiljumlah);
            System.out.println("Hasil pengurangan: " + hasilkurang);
            System.out.println("Hasil perkalian  : " + hasilkali);
            if (angka2 != 0) {
                System.out.println("Hasil pembagian  : " + hasilbagi);
            }
        }
    }
}
