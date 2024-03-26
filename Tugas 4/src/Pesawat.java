class Plane {

    String jenisMesin;
    String kecepatan;
    String jenisPesawat;
    String tempat;

    public Plane() {
    }

    public Plane(String jenisMesin, String kecepatan, String jenisPesawat, String tempat) {
        this.jenisMesin = jenisMesin;
        this.kecepatan = kecepatan;
        this.jenisPesawat = jenisPesawat;
        this.tempat = tempat;
    }

    // Method overloading dengan baawapenumpang (1)
    public void bawaPenumpang() {
        System.out.println("Pesawat ini membawa penumpang.");
    }

    // Method overloading dengan baawapenumpang (2)
    public void bawaPenumpang(int jumlahPenumpang) {
        System.out.println("Pesawat ini membawa " + jumlahPenumpang + " penumpang.");
    }

    // Method overloading dengan baawapenumpang (3)
    public void bawaPenumpang(String tujuan, int jumlahPenumpang) {
        System.out.println("Pesawat menuju " + tujuan + " dengan membawa " + jumlahPenumpang + " penumpang.");
    }

    public void terbang () {
        System.out.println(kecepatan + " adalah kecepatan rata-rata pesawat saat mengudara");
    }

    public void freestyle () {
        System.out.println(jenisPesawat + " adalah jenis pesawat yang digunakan untuk freestyle saat peringatan HUT RI ke-78");
    }

    public void jatuh () {
        System.out.println(tempat + " TKP jatuhnya pesawat Lion Air");
    }

    public void takeoff () {
        System.out.println(tempat + " Tempat take off pesawat itu");
    }
}

class pesawat  {

    public static void main(String[] args) {
        Plane Pesawatcuy = new Plane("Turbojet Engine", "700-800 KM/J", "KT-1B Wongbee", "Malang");

        Pesawatcuy.bawaPenumpang();
        Pesawatcuy.bawaPenumpang(45);
        Pesawatcuy.bawaPenumpang("Surabaya",367);
        Pesawatcuy.terbang();
        Pesawatcuy.freestyle();
        Pesawatcuy.jatuh();
        Pesawatcuy.takeoff();
    }
}
