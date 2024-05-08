public class Main {
    public static void main(String[] args) {

        Pegawai pegawaiTetap = new PegawaiTetap("Bocchi Kampas Kopling", "1234567890", 5000000);

        Pegawai pegawaiHarian = new PegawaiHarian("Farhan Kebab", "0987654321", 50000, 45);

        Pegawai sales = new Sales("Rahmat Corolla", "1357902468", 10000000, 0.1);

        System.out.println("Informasi dan Gaji Pegawai:");
        System.out.println("Pegawai Tetap:");
        System.out.println("Nama: " + pegawaiTetap.nama);
        System.out.println("No. KTP: " + pegawaiTetap.noKTP);
        System.out.println("Gaji: Rp." + pegawaiTetap.hitungGaji());
        System.out.println();

        System.out.println("Pegawai Harian:");
        System.out.println("Nama: " + pegawaiHarian.nama);
        System.out.println("No. KTP: " + pegawaiHarian.noKTP);
        System.out.println("Gaji: Rp." + pegawaiHarian.hitungGaji());
        System.out.println();

        System.out.println("Sales:");
        System.out.println("Nama: " + sales.nama);
        System.out.println("No. KTP: " + sales.noKTP);
        System.out.println("Gaji: Rp." + sales.hitungGaji());
    }
}
