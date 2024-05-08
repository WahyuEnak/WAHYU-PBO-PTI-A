class Sales extends Pegawai {
    
    private double penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, double penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    @Override
    public double hitungGaji() {
        return penjualan * komisi;
    }
}
