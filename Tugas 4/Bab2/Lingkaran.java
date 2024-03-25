public class Lingkaran {
    int alas, tinggi;

    public Lingkaran(int alas) {
        this.alas = alas;
    }

    public Lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public Lingkaran(String alas, String tinggi) {
        this.alas = parseToInt(alas);
        this.tinggi = parseToInt(tinggi);
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }

    public static int parseToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot parse " + value + " to integer.");
            return 0; // default value jika parsing gagal
        }
    }

    public static class LingkaranMain {
        public static void main(String[] args) {
            Lingkaran l = new Lingkaran(3);
            l.setTinggi(10);
            l.displayMessage();
            Lingkaran l2 = new Lingkaran(4, 10);
            l2.displayMessage();
            
            // Instansiasi objek Lingkaran dengan constructor bertipe data String
            Lingkaran lString = new Lingkaran("5", "8");
            lString.displayMessage();
        }
    }
}
