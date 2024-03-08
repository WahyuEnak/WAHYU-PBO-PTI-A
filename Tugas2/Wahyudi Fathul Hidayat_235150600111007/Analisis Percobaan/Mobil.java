import java.util.Scanner;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatanKmh; // Kecepatan dalam kilometer per jam
    private double kecepatanMs; // Kecepatan dalam meter per detik
    private double waktu; // Waktu dalam detik

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(double kmh) {
        kecepatanKmh = kmh;
        rubahKecepatan(kmh);
    }

    private void rubahKecepatan(double kmh) {
        kecepatanMs = kmh * 1000 / 3600; // Konversi km/h ke m/s
        System.out.println("Kecepatan dalam satuan m/s: " + kecepatanMs);
    }

    private void rubahSekon(double jam) {
        waktu = jam * 3600; // Konversi jam ke detik
    }

    public void setWaktu(double jam) {
        rubahSekon(jam); // Panggil method rubahSekon untuk mengubah jam menjadi detik
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatanKmh + " km/h.");
        double jarak = hitungJarak();
        System.out.println("Dalam waktu " + (waktu / 3600) + " jam, mobil dapat menempuh jarak " + jarak + " km.");
    }

    public double hitungJarak() {
        return kecepatanKmh * (waktu / 3600); // Menghitung jarak yang dapat ditempuh
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setKecepatan(60); // Set kecepatan dalam km/h
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan waktu perjalanan (jam): ");
        double waktuPerjalanan = scanner.nextDouble();
        mobil.setWaktu(waktuPerjalanan); // Set waktu perjalanan
        
        mobil.displayMessage();
        scanner.close();
    }
}
