public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("Slamet Kopling", "1234567890", true, true);
        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "Sagiri Kampas Rem", "0987654321", false, true);
        Pekerja c = new Pekerja(1000, 2016, 2, "Farhan Kebab", "1357908642", true, false);
        Manager d = new Manager("HRD", 7500, 2009, 10, "Bocchi Oli Samping", "2468013579", false, true);

        System.out.println("Manusia:");
        System.out.println(a);
        System.out.println();

        System.out.println("MahasiswaFILKOM:");
        System.out.println(b);
        System.out.println();

        System.out.println("Pekerja:");
        System.out.println(c);
        System.out.println();

        System.out.println("Manager:");
        System.out.println(d);
    }
}
