import java.util.Scanner;

class Mahasiswa {
    int kataPerHari; // dalam kata per hari

    public Mahasiswa(int kataPerHari) {
        this.kataPerHari = kataPerHari;
    }

    public double hitungWaktuHabiskan(int lembarBuku) {
        int totalKata = lembarBuku * 2 * 100;
        double totalHari = (double) totalKata / kataPerHari;
        return totalHari;
    }
}

public class Ouit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kata per hari: ");
        int kataPerHari = scanner.nextInt();

        Mahasiswa mahasiswaA = new Mahasiswa(kataPerHari);

        System.out.println("Masukkan jumlah halaman buku: ");
        int jumlahHalaman = scanner.nextInt();

        double waktuHabiskan = mahasiswaA.hitungWaktuHabiskan(jumlahHalaman);
        System.out.println("Mahasiswa akan menghabiskan satu buku dalam " + waktuHabiskan + " hari.");

        scanner.close();
    }
}
