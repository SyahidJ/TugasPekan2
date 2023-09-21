package TugasPekan2;

import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Nama    : Syahid Jundulloh");
            System.out.println("NIM     : C2183207011");
            System.out.println("Prodi   : Pendidikan Teknologi Informasi 21A");
            
            System.out.println("----------------------------------");
            
            int angka;
            
            while (true) {
                System.out.print("Masukkan sebuah angka bulat (0 untuk keluar): ");
                angka = input.nextInt();
                
                if (angka == 0) {
                    System.out.println("Program selesai.");
                    break;
                } else if (angka % 2 == 0) {
                    System.out.println("Angka genap.");
                } else {
                    System.out.println("Angka ganjil.");
                }
            }
        }
    }
}
