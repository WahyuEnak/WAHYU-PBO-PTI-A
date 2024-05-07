import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KueCoy[] kueArray = new KueCoy[25];

        // Isi array dengan berbagai jenis kue
        kueArray[0] = new KuePesanan("Brownies", 20000.0, 1.5);
        kueArray[1] = new KuePesanan("Lapis Legit", 25000.0, 2.0);
        kueArray[2] = new KuePesanan("Kue Lumpur", 25000.0, 2.0);
        kueArray[3] = new KuePesanan("Kue Pie", 25000.0, 2.0);
        kueArray[4] = new KuePesanan("Kue Pukis", 25000.0, 2.0);
        kueArray[5] = new KuePesanan("Kue Nastar", 25000.0, 2.0);
        kueArray[6] = new KuePesanan("Kue Putri Salju", 25000.0, 2.0);
        kueArray[7] = new KuePesanan("Kue Tiramissu", 25000.0, 2.0);
        kueArray[8] = new KuePesanan("Crossiant", 25000.0, 2.0);
        kueArray[9] = new KuePesanan("Pane Cake", 25000.0, 2.0);

        kueArray[10] = new KueJadi("Kue Oli Samping", 11000.0, 2);
        kueArray[11] = new KueJadi("Kue Karburator", 11000.0, 2);
        kueArray[12] = new KueJadi("Kue Kampas Kopling", 11000.0, 2);
        kueArray[13] = new KueJadi("Kue Corolla Altis", 11000.0, 2);
        kueArray[14] = new KueJadi("Kue Innova Reborn", 11000.0, 2);
        kueArray[15] = new KueJadi("Kue Grand Max", 11000.0, 2);
        kueArray[16] = new KueJadi("Kue CRV", 11000.0, 2);
        kueArray[17] = new KueJadi("Kue Jupiter MX", 11000.0, 2);
        kueArray[18] = new KueJadi("Kue Supra Geter", 11000.0, 2);
        kueArray[19] = new KueJadi("Kue Shoogun", 11000.0, 2);

        kueArray[20] = new KueBasi("Kue Busi Gosong", 10000.0, 5);
        kueArray[21] = new KueBasi("Kue Oli Kering", 15000.0, 3);
        kueArray[22] = new KueBasi("Kue Pertalite", 15000.0, 3);
        kueArray[23] = new KueBasi("Kue Mamah Aku Takut", 15000.0, 3);
        kueArray[24] = new KueBasi("Kue Pembohonk Publik", 15000.0, 3);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Semua Kue");
            System.out.println("2. Hitung Total Harga Kue");
            System.out.println("3. Hitung Total Lama Hari Kue Basi");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Semua Kue:");
                    for (KueCoy kue : kueArray) {
                        if (kue != null) {
                            System.out.println(kue.getClass().getSimpleName() + " - " + kue);
                        }
                    }
                    break;
                case 2:
                    double totalHarga = 0;
                    for (KueCoy kue : kueArray) {
                        if (kue != null) {
                            totalHarga += kue.hitungHarga();
                        }
                    }
                    System.out.println("Total Harga Kue: " + totalHarga);
                    break;
                case 3:
                    int totalLamaHari = 0;
                    for (KueCoy kue : kueArray) {
                        if (kue instanceof KueBasi) {
                            totalLamaHari += ((KueBasi) kue).hitungHarga();
                        }
                    }
                    System.out.println("Total Lama Hari Kue Basi: " + totalLamaHari);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
