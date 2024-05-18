import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis objek yang ingin dibuat:");
        System.out.println("1. Manusia");
        System.out.println("2. Hewan");
        System.out.println("3. Anomali");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Membuat objek Manusia
            System.out.print("Saha nama sia? ");
            String nama = scanner.nextLine();
            System.out.print("Sabaraha umur na? ");
            int umur = scanner.nextInt();

            Manusia manusia = new Manusia(nama, umur);

            // Menampilkan informasi Manusia
            manusia.tampilkanNama();
            manusia.tampilkanUmur();
            manusia.makan();
            manusia.berjalan();
            manusia.bersuara();

        } else if (pilihan == 2) {
            // Membuat objek Hewan
            System.out.print("Nama hewannya? ");
            String nama = scanner.nextLine();
            System.out.print("Umur hewannya? ");
            int umur = scanner.nextInt();

            Hewan hewan = new Hewan(nama, umur);

            // Menampilkan informasi Hewan
            hewan.tampilkanNama();
            hewan.tampilkanUmur();
            hewan.makan();
            hewan.berjalan();
            hewan.bersuara();

        } else if (pilihan == 3) {
            // Membuat objek Alien
            System.out.print("Sia namo anomalinyo? ");
            String nama = scanner.nextLine();
            System.out.print("Bara umurnyo? ");
            int umur = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Dima planet asalnyo? ");
            String planetAsal = scanner.nextLine();

            Anomali alien = new Anomali(nama, umur, planetAsal);

            // Menampilkan informasi Alien
            alien.tampilkanNama();
            alien.tampilkanUmur();
            alien.tampilkanPlanetAsal();
            alien.makan();
            alien.berjalan();
            alien.bersuara();
            alien.eksplorasi(); // Memanggil metode eksplorasi khusus untuk Alien
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
