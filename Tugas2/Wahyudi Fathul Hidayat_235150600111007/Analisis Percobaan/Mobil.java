public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatanKmh; // Kecepatan dalam kilometer per jam
    private double kecepatanMs; // Kecepatan dalam meter per detik

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

    public double hitungJarak(double waktu) {
        return kecepatanKmh * waktu; // Menghitung jarak yang dapat ditempuh
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("Mempunyai nomor plat " + noPlat);
        System.out.println("Serta memiliki warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatanKmh + " km/h.");
        double waktu = 2.5; // Contoh waktu dalam jam
        double jarak = hitungJarak(waktu);
        System.out.println("Dalam waktu " + waktu + " jam, mobil dapat menempuh jarak " + jarak + " km.");
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.setKecepatan(60); // Set kecepatan dalam km/h
        mobil.displayMessage();
    }
}
