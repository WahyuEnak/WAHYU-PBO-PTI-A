class Bike {
    String merk;
    String jenisMotor;
    int jumlahGigi;
    int ccMesin;
    String tempat;
    String nganter;

    public Bike() {

    }


    public Bike(String merk, String jenisMotor, int jumlahGigi, int ccMesin, String tempat, String nganter) {
        this.merk = merk;
        this.jenisMotor = jenisMotor;
        this.jumlahGigi = jumlahGigi;
        this.ccMesin = ccMesin;
        this.tempat = tempat;
        this.nganter = nganter;

    }
     // Method overloading dengan irit (1)
    public void irit() {
        System.out.println("Motor ini sedang berjalan dengan irit!");
    }

    // Method overloading dengan irit (2)
    public void irit(int kecepatan) {
        System.out.println("Motor ini berjalan irit dengan kecepatan " + kecepatan + " km/jam!");
    }

    // Method overloading dengan irit (3)
    public void irit(int ccMesin, int kecepatan) {
        System.out.println("Motor dengan mesin " + ccMesin + "cc berjalan irit dengan kecepatan " + kecepatan + " km/jam!");
    }

    public void balapan () {
        System.out.println(jenisMotor + " adalah jenis motor yang biasa dipakai di ajang balap resmi");
    }

    public void nanjak () {
        System.out.println(jumlahGigi + " adalah set gigi yang terbaik untuk menanjak");
    }

    public void ngebut () {
        System.out.println(ccMesin + " adalah rekomendasi CC mesin agar motor mampu menempuh kecepatan maksimal");
    }

    public void nabrak () {
        System.out.println(tempat + " TKP motor itu tertabrak");
    }

    public void nganter () {
        System.out.println(nganter + " diantar dengan motor");
    }

}

public class Motor {

    public static void main(String[] args) {
        Bike Motorcuy = new Bike("Honda", "Sport Fairing", 1, 1000, "Malang", "Adit" );

        Motorcuy.irit();
        Motorcuy.irit(120);
        Motorcuy.irit(1000, 250);
        Motorcuy.balapan();
        Motorcuy.nanjak();
        Motorcuy.ngebut();
        Motorcuy.nabrak();
        Motorcuy.nganter();
    }
}
