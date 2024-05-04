// Subclass KueJadi
class KueJadi extends KueCoy {
    double jumlah;

    KueJadi(String nama, double harga, double jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    double hitungHarga() {
        return harga * jumlah * 2;
    }
}
