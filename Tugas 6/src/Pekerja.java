import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, 1, 1);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        long lamaBekerja = ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
        if (lamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaBekerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getTunjanganAnak() {
        return jumlahAnak * 20.0;
    }

    public double getGaji() {
        return gaji + getBonus() + getTunjanganAnak();
    }

    public String toString() {
        return super.toString() + "\ntahun masuk: " + tahunMasuk.getYear() + "\njumlah anak: " + jumlahAnak
                + "\ngaji: " + getGaji();
    }
}
