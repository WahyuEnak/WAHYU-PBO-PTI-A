// Subclass KuePesanan
class KuePesanan extends KueCoy {
    double berat;

    KuePesanan(String nama, double harga, double berat) {
        this.nama = nama;
        this.harga = harga;
        this.berat = berat;
    }

    double hitungHarga() {
        return harga * berat;
    }
}
