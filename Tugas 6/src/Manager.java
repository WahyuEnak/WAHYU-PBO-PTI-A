class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public double getTunjangan() {
        return super.getTunjangan() + 0.10 * super.getGaji();
    }

    public String toString() {
        return super.toString() + "\ndepartemen: " + departemen;
    }
}
