class KueJadi extends KueCoy {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public double getJumlah() {
        return jumlah;
    }
}
