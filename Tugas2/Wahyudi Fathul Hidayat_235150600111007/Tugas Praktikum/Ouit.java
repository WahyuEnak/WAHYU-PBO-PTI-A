import java.util.Scanner;

class Mahasiswa {
    String nama;
    int kecepatanMenulis; // dalam kata per hari

    public Mahasiswa(String nama, int kecepatanMenulis) {
        this.nama = nama;
        this.kecepatanMenulis = kecepatanMenulis;
    }

    public double hitungWaktuHabiskan(int jumlahHalaman) {
        int totalKata = jumlahHalaman * 2 * 100;
        double totalHari = (double) totalKata / kecepatanMenulis;
        return totalHari;
    }
}

public class Ouit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        System.out.println("Masukkan kata per hari: ");
        int kecepatanMenulis = scanner.nextInt();

        Mahasiswa mahasiswaA = new Mahasiswa(namaMahasiswa, kecepatanMenulis);

        System.out.println("Masukkan jumlah halaman buku: ");
        int jumlahHalaman = scanner.nextInt();

        double waktuHabiskan = mahasiswaA.hitungWaktuHabiskan(jumlahHalaman);
        System.out.println(mahasiswaA.nama + " akan menghabiskan satu buku dalam " + waktuHabiskan + " hari.");

        scanner.close();
    }
}
