package TugasPekan2;
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        System.out.println("Nama    : Syahid Jundulloh");
        System.out.println("NIM     : C2183207011");
        System.out.println("Prodi   : Pendidikan Teknologi Informasi 21A");
        
        System.out.println("----------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            double alas, tinggi;
            System.out.print("Masukkan panjang alas segitiga: ");
            alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            tinggi = input.nextDouble();
            double luas = 0.5 * alas * tinggi;
            System.out.println("Luas segitiga adalah: " + luas);
        }
    }
}