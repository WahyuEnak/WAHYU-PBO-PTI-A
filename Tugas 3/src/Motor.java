class Bike {
    
    String merk;
    String jenisMotor;
    int jumlahGigi;
    int ccMesin;

    public void irit () {
        System.out.println(merk + " adalah pabrikan motor paling irit untuk saat ini");
    }

    public void balapan () {
        System.out.println(jenisMotor + " adalah jenis motor yang biasa dipakai di ajang balap resmi");
    }

    public void nanjak () {
        System.out.println(jumlahGigi + " adalh set gigi yang terbaik untuk menanjak");
    }

    public void ngebut () {
        System.out.println(ccMesin + " adalah rekomendasi CC mesin agar motor mampu menempuh kecepatan maksimal");
    }

}

public class Motor {

    public static void main(String[] args) {
        Bike Motorcuy = new Bike();
        Motorcuy.merk = "Honda";
        Motorcuy.jenisMotor = "Sport Fairing";
        Motorcuy.jumlahGigi = 1;
        Motorcuy.ccMesin = 1000;

        Motorcuy.irit();
        Motorcuy.balapan();
        Motorcuy.nanjak();
        Motorcuy.ngebut();

    }
}
