import java.text.NumberFormat;
import java.util.Locale;

abstract class KueCoy {
    private String nama;
    private double harga;

    public KueCoy(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    abstract double hitungHarga();

    public String toString() {
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return "Nama: " + nama + ", Harga: " + rupiahFormat.format(harga);
    }
}

