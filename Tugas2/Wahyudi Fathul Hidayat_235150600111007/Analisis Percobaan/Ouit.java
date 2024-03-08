public class BukuTulis {
    private int jumlahHalaman;
    private int kataPerHari;

    // Constructor
    public BukuTulis(int jumlahHalaman, int kataPerHari) {
        this.jumlahHalaman = jumlahHalaman;
        this.kataPerHari = kataPerHari;
    }

    // Method untuk menghitung berapa lama menghabiskan satu buku
    public double hitungDurasi() {
        int totalSetengahHalaman = jumlahHalaman * 2; // Setiap halaman memiliki dua setengah halaman
        int totalKata = totalSetengahHalaman * 100; // Setiap setengah halaman setara dengan 100 kata
        int hariDiperlukan = totalKata / kataPerHari;
        return hariDiperlukan;
    }

    // Method untuk mencetak hasil
    public void cetakHasil() {
        double durasi = hitungDurasi();
        System.out.println("Mahasiswa A memerlukan sekitar " + durasi + " hari untuk menulis satu buku.");
    }

    public static void main(String[] args) {
        BukuTulis buku = new BukuTulis(50, 100); // Buku berisi 50 lembar, 100 kata per hari
        buku.cetakHasil();
    }
}
