public class Mobil {
    
    String merk;
    String jenisMobil;
    int ccMesin;
    String tempat;
    
    // Konstruktor overload pertama
    public Mobil(String merk) {
        this.merk = merk;
    }

    // Konstruktor overload kedua
    public Mobil(String merk, String jenisMobil) {
        this.merk = merk;
        this.jenisMobil = jenisMobil;
    }

    // Konstruktor overload ketiga
    public Mobil(String merk, String jenisMobil, int ccMesin, String tempat) {
        this.merk = merk;
        this.jenisMobil = jenisMobil;
        this.ccMesin = ccMesin;
        this.tempat = tempat;
    }

    
    // Method Overload Pertama
    public void jalan(String peruntukan) {
        System.out.println(merk + " adalah mobil yang cocok dipakai di " + peruntukan);
    }

    // Methodd Overload Kedua
    void ngegas(int powerMesin) {
        System.out.println(ccMesin + " adalah besaran cc yang dimiliki oleh " + jenisMobil + " " + merk);
    }

    void nabrak(int tempatz) {
        System.out.println("Sebuah mobil telah menabrak toko di daerah " + tempat);
    }

    // Method Overload Ketiga
    void rodaMuter(boolean empatRoda) {
        if (empatRoda)
            System.out.println(jenisMobil + " " + merk + " adalah mobil dengan empat roda penggerak");
        else
            System.out.println(jenisMobil + " " + merk + " adalah mobil dengan dua roda penggerak");
    }
    
    // Method yang mengembalikan tipe data class itu sendiri
    public Mobil getMobilInstance() {
        return this;
    }
}
