public class Main {
    public static void main(String[] args) {
        KueCoy[] kueArray = new KueCoy[20];

        // Isi array dengan berbagai jenis kue
        kueArray[0] = new KuePesanan("Brownies", 20000.0, 1.5);
        kueArray[1] = new KuePesanan("Lapis Legit", 25000.0, 2.0);
        kueArray[2] = new KuePesanan("Cheesecake", 30000.0, 1.0);
        kueArray[3] = new KuePesanan("Red Velvet Cake", 35000.0, 1.2);
        kueArray[4] = new KuePesanan("Tiramisu", 40000.0, 1.8);
        kueArray[5] = new KuePesanan("Donat", 5000.0, 10);
        kueArray[6] = new KuePesanan("Croissant", 10000.0, 6);
        kueArray[7] = new KuePesanan("Bolu Gulung", 15000.0, 4);
        kueArray[8] = new KuePesanan("Pancake", 12000.0, 5);
        kueArray[9] = new KuePesanan("Kue Lumpur", 4000.0, 10);

        kueArray[10] = new KueJadi("Kue Oli Samping", 11000.0, 2);
        kueArray[11] = new KueJadi("Kue Kampas Kopling", 20000.0, 1);
        kueArray[12] = new KueJadi("Kue Corolla Altis", 400000.0, 2);
        kueArray[13] = new KueJadi("Kue Innova Reborn", 600000.0, 3);
        kueArray[14] = new KueJadi("Kue Jupiter MX", 14000.0, 5);
        kueArray[15] = new KueJadi("Kue Vario 125", 12500.0, 3);
        kueArray[16] = new KueJadi("Kue Redmi Note 10 Pro", 3000.0, 45);
        kueArray[17] = new KueJadi("Kue Samsung J2 Prime", 2500.0, 50);
        kueArray[18] = new KueJadi("Kue Anomali", 0, 0);
        kueArray[19] = new KueJadi("Kue Sigma", 1000000000.0, 1);

        // Tampilkan semua kue beserta jenisnya
        System.out.println("Semua Kue:");
        for (KueCoy kue : kueArray) {
            System.out.println(kue.getClass().getSimpleName() + " - " + kue);
        }

    }
}
