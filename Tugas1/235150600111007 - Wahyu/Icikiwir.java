import java.util.Scanner;
import java.util.Random;

public class Icikiwir {
    public static void main(String[] args) {
        String username;
        String password;

        String usernameBenar = "WahyuEnak";
        String passwordBenar = "password";

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan username: ");
        username = input.nextLine();

        System.out.println("Masukkan password: ");
        password = input.nextLine();

        if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
            System.out.println("Login berhasil, uji hoki kau pakai skill 1 Franco!");

            String[] heroeuy = {"Saber", "Pance", "Jigong", "Nathan", "Aurora", "yahaha miss", "ciee miss"};
            Mancing mancing = new Mancing(heroeuy);

            System.out.println("Tarikan Franco kau:");
            for (int i = 0; i < 7; i++) {
                String pancingan = mancing.spin();
                System.out.println("tarikan ke-" + (i + 1) + ": " + pancingan);
            }

            System.out.println("Kau mau logout ndak? (ya/tidak)");
            String logoutcoy = input.nextLine();
            if (logoutcoy.equalsIgnoreCase("ya")) {
                System.out.println("Anda telah logout (Kecewa Berat).");
            } else {
                System.out.println("Logout dibatalkan.");
            }
        } else {
            System.out.println("Username atau password salah. Login gagal.");
        }
    }
}

class Mancing {
    private String[] heromusuh;

    public Mancing(String[] heromusuh) {
        this.heromusuh = heromusuh;
    }

    public String spin() {
        Random random = new Random();
        int index = random.nextInt(heromusuh.length);
        return heromusuh[index];
    }
}
