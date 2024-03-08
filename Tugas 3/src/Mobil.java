class Car {
    
    String merk;
    String jenisMobil;
    int jumlahGigi;
    int ccMesin;
    int RONbensin;
    
    public void jalan() {
        System.out.println(merk + " adalah mobil pabrikan Jepang yang jalannya palingn nyaman");
    }

    void nanjak() {
        System.out.println(jumlahGigi + " adalah rekomendasi set gigi untuk menanjak");
    }

    void offroad() {
        System.out.println(ccMesin + " adalah besaran cc yang biasa dipakai di mobil SUV offroad");
    }

    void ngebut() {
        System.out.println(RONbensin + " adalah minimal RON bensin untuk Lamborghini");
    }

    void drift() {
        System.out.println(jenisMobil + " adalah rekomendasi jenis mobil untuk ajang drift");
    }

}

public class Mobil {
    public static void main(String[] args) {
        Car Mobilcuy = new Car();
        Mobilcuy.merk = "Mazda";
        Mobilcuy.jenisMobil = "Coupe";
        Mobilcuy.jumlahGigi = 1;
        Mobilcuy.ccMesin = 4500;
        Mobilcuy.RONbensin = 98;

        Mobilcuy.jalan();
        Mobilcuy.nanjak();
        Mobilcuy.offroad();
        Mobilcuy.ngebut();
        Mobilcuy.drift();
    }

}
