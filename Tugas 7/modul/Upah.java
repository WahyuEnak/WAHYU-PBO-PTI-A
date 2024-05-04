import java.time.LocalDate;

public class Upah extends Employee {
    private double ProduksiPerMinggu; // produksi barang per minggu
    private double UpahPerBarang; // upah per barang

    public Upah(String name, String noKTP, double ProduksiPerMinggu, double UpahPerBarang, LocalDate birthDate) {
        super(name, noKTP, birthDate);
        this.ProduksiPerMinggu = ProduksiPerMinggu;
        this.UpahPerBarang = UpahPerBarang;
    }

    public void setProduksiPerMinggu(double ProduksiPerMinggu) {
        this.ProduksiPerMinggu = ProduksiPerMinggu;
    }

    public double getProduksiPerMinggu() {
        return ProduksiPerMinggu;
    }

    public void setUpahPerBarang(double UpahPerBarang) {
        this.UpahPerBarang = UpahPerBarang;
    }

    public double getUpahPerBarang() {
        return UpahPerBarang;
    }

    public double earnings() {
        return getUpahPerBarang() * getProduksiPerMinggu();
    }

    public String toString() {
        return String.format("Upah Employee: " + super.toString() + "\nproduksi per minggu: " + getProduksiPerMinggu() + "\nupah per barang: " + getUpahPerBarang());
    }
}

