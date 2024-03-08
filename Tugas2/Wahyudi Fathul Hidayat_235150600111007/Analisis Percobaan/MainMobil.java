import java.util.Scanner;

public class MainMobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    
    public void setNoPlat(String s){
    noPlat = s;
    }
    public void setWarna(String s){
    warna = s;
    }
    public void setManufaktur(String s){
    manufaktur = s;
    }
    public void setKecepatan(int i){
    kecepatan = i;
    }
    public void displayMessage(){
    System.out.println("Mobil anda adalah bermerek "+manufaktur);
    System.out.println("mempunyai nomor plat "+noPlat);
    System.out.println("serta memililki warna "+warna);
    System.out.println("dan mampu menempuh kecepatan "+kecepatan);
    }
    public static void main(String[] args) {
    
    Mobil m1 = new Mobil();
    
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan kecepatan maksimal mobil Anda:");
    int kecepatan = input.nextInt();
    input.nextLine();
    m1.setKecepatan(kecepatan);

    System.out.println("Masukkan manufaktur mobil Anda:");
    String manufaktur = input.nextLine();
    m1.setManufaktur(manufaktur);

    System.out.println("Masukkan plat nomor Anda:");
    String noPlat = input.nextLine();
    m1.setNoPlat(noPlat);

    System.out.println("Masukkan warna mobil Anda:");
    String warna = input.nextLine();
    m1.setWarna(warna);

    
    Mobil m2 = new Mobil();
    m2.setKecepatan(kecepatan);
    m2.setManufaktur(manufaktur);
    m2.setNoPlat(noPlat);
    m2.setWarna(warna);
    m2.displayMessage();
    System.out.println("================");
    
    
    System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    m1.setWarna("Hijau");
    
    m1.displayMessage();
    }
    public void setMerek(String merek1) {
        throw new UnsupportedOperationException("Unimplemented method 'setMerek'");
    }
    }

