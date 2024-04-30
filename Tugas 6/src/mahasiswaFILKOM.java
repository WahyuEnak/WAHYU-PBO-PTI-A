class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String[] prodi = {"", "Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "", "", "Pendidikan Teknologi Informasi", "Teknologi Informasi"};
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodiDigit = Integer.parseInt(String.valueOf(nim.charAt(6)));
        return prodi[prodiDigit] + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75.0;
        } else if (ipk >= 3.0) {
            return 50.0;
        } else {
            return 0.0;
        }
    }

    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nnim: " + nim + "\nipk: " + ipk + "\nstatus: " + getStatus();
    }
}
