public class Anomali implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;
    private String planetAsal;

    // Konstruktor dengan parameter nama, umur, dan planetAsal
    public Anomali(String nama, int umur, String planetAsal) {
        this.nama = nama;
        this.umur = umur;
        this.planetAsal = planetAsal;
    }

    @Override
    public void makan() {
        System.out.println("Makan dengan menggunakan energi skibidi sigma gyaat rizz");
    }

    @Override
    public void berjalan() {
        System.out.println("Berjalan dengan melompat kadang melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya berbunyi skidibabab pop yes yes");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama anomali: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur anomali: " + this.umur);
    }

    public void tampilkanPlanetAsal() {
        System.out.println("Planet asal: " + this.planetAsal);
    }

    public void eksplorasi() {
        System.out.println("Anomali sedang menjelajahi yutup kids");
    }
}
