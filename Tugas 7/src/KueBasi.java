class KueBasi extends KueCoy {
    private int lamaHari;

    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    double hitungHarga() {
        return getHarga() - (lamaHari * (getHarga() * 0.1));
    }
}
