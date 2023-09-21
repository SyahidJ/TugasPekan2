package TugasPekan2;
import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            double total = 0;
            int jumlahData = 0;

            System.out.println("Masukkan serangkaian angka (selesai dengan menginputkan karakter non-numerik):");

            while (input.hasNextDouble()) {
                double angka = input.nextDouble();
                total += angka;
                jumlahData++;
            }

            if (jumlahData > 0) {
                double rataRata = total / jumlahData;
                System.out.println("Rata-rata angka yang dimasukkan adalah: " + rataRata);
            } else {
                System.out.println("Tidak ada angka yang dimasukkan.");
            }

            input.nextLine(); // Membersihkan newline karakter

            System.out.print("Apakah Anda ingin menghitung rata-rata lagi? (Ya/Tidak): ");
            String jawaban = input.nextLine();

            if (!jawaban.equalsIgnoreCase("Ya")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah menggunakan program ini!");
        input.close();
    }
}
