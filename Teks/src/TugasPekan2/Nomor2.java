package TugasPekan2;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        
        System.out.println("Nama    : Syahid Jundulloh");
        System.out.println("NIM     : C2183207011");
        System.out.println("Prodi   : Pendidikan Teknologi Informasi 21A");
        
        System.out.println("----------------------------------");
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan informasi berikut:");
            System.out.print("Nama    : ");
            String nama = input.nextLine();
            System.out.print("Usia    : ");
            int usia = input.nextInt();
            System.out.print("Tinggi Badan (dalam cm): ");
            double tinggiBadan = input.nextDouble();
            System.out.println("\nInformasi yang Anda masukkan:");
            System.out.println("Nama          : " + nama);
            System.out.println("Usia          : " + usia + " tahun");
            System.out.println("Tinggi Badan  : " + tinggiBadan + " cm");
        }
    }
}
