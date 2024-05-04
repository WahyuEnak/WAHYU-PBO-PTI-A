import java.text.NumberFormat;
import java.util.Locale;

// Abstract class Kue
abstract class KueCoy{
    String nama;
    double harga;

    abstract double hitungHarga();

    public String toString() {
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return "Nama: " + nama + ", Harga: " + rupiahFormat.format(harga);
    }
}

