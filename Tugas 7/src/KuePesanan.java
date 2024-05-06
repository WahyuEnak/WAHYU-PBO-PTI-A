class KuePesanan extends KueCoy {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    double hitungHarga() {
        return getHarga() * berat;
    }
}
