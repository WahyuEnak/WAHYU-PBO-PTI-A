class Plane {

    String jenisMesin;
    String kecepatan;
    String jenisPesawat;

    public void bawaPenumpang () {
        System.out.println(jenisMesin + " adalah jenis mesin yang biasa dipakai pada pesawat penumpang");
    }

    public void terbang () {
        System.out.println(kecepatan + " adalah kecepatan rata-rata pesawat saat mengudara");
    }

    public void freestyle () {
        System.out.println(jenisPesawat + " adalah jenis pesawat yang digunakn untuk freestyle saat peringatan HUT RI ke-78");
    }
}

class pesawat  {

    public static void main(String[] args) {
        Plane Pesawatcuy = new Plane ();
        Pesawatcuy.jenisMesin = "Turbojet Engine";
        Pesawatcuy.kecepatan = "700-800 KM/J";
        Pesawatcuy.jenisPesawat = "KT-1B Wongbee";

        Pesawatcuy.bawaPenumpang();
        Pesawatcuy.terbang();
        Pesawatcuy.freestyle();
    }
}
