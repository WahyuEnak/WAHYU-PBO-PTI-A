public class Main {
    public static void main(String[] args) {
        // Membuat objek pertama menggunakan konstruktor overload pertama
        Mobil mobil1 = new Mobil("Lexus", "Sedan", 3456, "Malang");
        
        // Membuat objek kedua menggunakan konstruktor overload kedua
        Mobil mobil2 = new Mobil("Aston Martin", "SUV", 4000, "Surabaya");
        
        // Membuat objek ketiga menggunakan konstruktor overload ketiga
        Mobil mobil3 = new Mobil("Lamborghini", "Sport", 6498, "Jakarta");
        
        // Menampilkan informasi tentang masing-masing mobil
        System.out.println("Informasi Mobil 1:");
        mobil1.jalan("jalanan perkotaan");
        mobil1.ngegas(10);
        mobil1.rodaMuter(false);

        System.out.println("\nInformasi Mobil 2:");
        mobil2.jalan("perjalanan jauh");
        mobil2.ngegas(15);
        mobil2.rodaMuter(true);
        
        System.out.println("\nInformasi Mobil 3:");
        mobil3.jalan("circuit");
        mobil3.ngegas(20);
        mobil3.rodaMuter(true);
    }
}
