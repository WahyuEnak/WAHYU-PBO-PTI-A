abstract class Pegawai {
    
    protected String nama;
    protected String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public abstract double hitungGaji();
}
