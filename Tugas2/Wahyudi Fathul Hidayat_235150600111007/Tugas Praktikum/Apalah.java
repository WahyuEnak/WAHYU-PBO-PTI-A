import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Penulis {
    String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }
}

class Buku {
    String judul;
    Penulis penulis;
    Kategori kategori;
    boolean sudahDibeli;

    public Buku(String judul, Penulis penulis, Kategori kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sudahDibeli = false;
    }

    public boolean isSudahDibeli() {
        return sudahDibeli;
    }

    public void setSudahDibeli(boolean sudahDibeli) {
        this.sudahDibeli = sudahDibeli;
    }
}

class Kategori {
    String nama;
    List<Buku> daftarBuku;

    public Kategori(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        this.daftarBuku.add(buku);
    }
}

class User {
    String username;
    String password;
    List<Buku> keranjang;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.keranjang = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        this.keranjang.add(buku);
        buku.setSudahDibeli(true); // Tandai buku sebagai sudah dibeli
    }
}

public class Apalah {
    static List<User> users = new ArrayList<>();
    static List<Buku> semuaBuku = new ArrayList<>();

    public static void main(String[] args) {
        // Menambahkan pengguna
        users.add(new User("admin", "admin123"));

        // Menambahkan buku-buku
        tambahBuku();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (login(username, password)) {
            System.out.println("Login berhasil!");
            // Lanjutkan dengan logika utama aplikasi setelah login berhasil
            menu();
        } else {
            System.out.println("Login gagal. Coba lagi.");
        }
    }

    public static boolean login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cari Buku");
            System.out.println("2. Lihat Keranjang");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
            switch (pilihan) {
                case 1:
                    cariBuku();
                    break;
                case 2:
                    lihatKeranjang();
                    break;
                case 3:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    public static void cariBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dicari: ");
        String judulCari = scanner.nextLine();
        boolean ditemukan = false;
        for (Buku buku : semuaBuku) {
            if (buku.judul.equalsIgnoreCase(judulCari)) {
                System.out.println("Buku ditemukan:");
                System.out.println("Judul: " + buku.judul);
                System.out.println("Penulis: " + buku.penulis.nama);
                System.out.println("Kategori: " + buku.kategori.nama);
                if (!buku.isSudahDibeli()) {
                    System.out.println("Apakah Anda ingin meminjam buku ini? (y/n)");
                    String jawaban = scanner.nextLine();
                    if (jawaban.equalsIgnoreCase("y")) {
                        beliBuku(buku);
                    }
                } else {
                    System.out.println("Buku sudah dipinjam.");
                }
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public static void beliBuku(Buku buku) {
        for (User user : users) {
            if (user.username.equals("admin")) {
                user.tambahBuku(buku); // Tambahkan buku ke keranjang
                System.out.println("Buku telah ditambahkan ke keranjang.");
                return;
            }
        }
        System.out.println("Pengguna tidak ditemukan.");
    }

    public static void lihatKeranjang() {
        for (User user : users) {
            if (user.username.equals("admin")) {
                System.out.println("Isi Keranjang:");
                if (user.keranjang.isEmpty()) {
                    System.out.println("Keranjang kosong.");
                } else {
                    for (Buku buku : user.keranjang) {
                        System.out.println("- " + buku.judul);
                    }
                }
                return;
            }
        }
        System.out.println("Pengguna tidak ditemukan.");
    }

    public static void tambahBuku() {
        Penulis penulis1 = new Penulis("Slamet Kopling");
        Penulis penulis2 = new Penulis("Kevin Lontong");
        Penulis penulis3 = new Penulis("Sigit Rendang");
        Penulis penulis4 = new Penulis("Farhan Kebab");
        Penulis penulis5 = new Penulis("Dimas Busi");

        Kategori teknologi = new Kategori("Teknologi");
        Kategori filsafat = new Kategori("Filsafat");
        Kategori sejarah = new Kategori("Sejarah");
        Kategori agama = new Kategori("Agama");
        Kategori psikologi = new Kategori("Psikologi");
        Kategori politik = new Kategori("Politik");
        Kategori fiksi = new Kategori("Fiksi");

        //Teknologi
        Buku buku1 = new Buku("Teknologi Kopling Oaling mutahir", penulis1, teknologi);
        Buku buku2 = new Buku("Teknologi Modern Dalam Proses Pembuatan Lontong", penulis2,teknologi);
        Buku buku3 = new Buku("Pengaruh Rendang Terhadap Perkembangan Teknologi", penulis3,teknologi);
        Buku buku4 = new Buku("Bagaimana Kebab Bisa Berkontribusi Dalam Perkembangan Teknolgi", penulis4,teknologi);
        Buku buku5 = new Buku("Perkembangan Teknologi Busi", penulis5,teknologi);
        //Filsafat
        Buku buku6 = new Buku("Filsafat Kopling", penulis1, filsafat);
        Buku buku7 = new Buku("Filsafat Lontong", penulis2, filsafat);
        Buku buku8= new Buku("Filsafat Rendang", penulis3, filsafat);
        Buku buku9 = new Buku("Filsafat Kebab", penulis4, filsafat);
        Buku buku10 = new Buku("Filsafat Busi", penulis5, filsafat);
        
        //Sejarah
        Buku buku11 = new Buku("Sejarah Pembuatan Kopling", penulis1, sejarah);
        Buku buku12 = new Buku("Sejarah Pembuatan Lontong", penulis2, sejarah);
        Buku buku13 = new Buku("Sejarah Pembuatan Rendang", penulis3, sejarah);
        Buku buku14 = new Buku("Sejarah Pembuatan Kebab", penulis4, sejarah);
        Buku buku15 = new Buku("Sejarah Pembuatan Busi", penulis5, sejarah);
        //Agama
        Buku buku16 = new Buku("The Quran", penulis1, agama);
        Buku buku17= new Buku("The Alkitab", penulis2, agama);
        Buku buku18= new Buku("The Veda", penulis3, agama);
        Buku buku19= new Buku("The Tripitaka", penulis4, agama);
        Buku buku20 = new Buku("The Shinsu Wujing", penulis5, agama);
        //Psikologi
        Buku buku21 = new Buku("Pengaruh Kopling Terhadap Kesehatan Mental", penulis1, psikologi);
        Buku buku22 = new Buku("Pengaruh Lontong Terhadap Kesehatan Mental", penulis2, psikologi);
        Buku buku23 = new Buku("Pengaruh Rendang Terhadap Kesehatan Mental", penulis3, psikologi);
        Buku buku24 = new Buku("Pengaruh Kebab Terhadap Kesehatan Mental", penulis4, psikologi);
        Buku buku25 = new Buku("Pengaruh Busi Terhadap Kesehatan Mental", penulis5, psikologi);
        //Politik
        Buku buku26 = new Buku("Bagaimana Kopling Bisa Menghancurkan Negara Aselole?", penulis1, politik);
        Buku buku27 = new Buku("Bagaimana Lontong Bisa Menghancurkan Negara Aselole?", penulis2, politik);
        Buku buku28 = new Buku("Bagaimana Rendang Bisa Menghancurkan Negara Aselole?", penulis3, politik);
        Buku buku29 = new Buku("Bagaimana Kebab Bisa Menghancurkan Negara Aselole?", penulis4, politik);
        Buku buku30 = new Buku("Bagaimana Busi Bisa Menghancurkan Negara Aselole?", penulis5, politik);
        //Fiksi
        Buku buku31 = new Buku("Kopling Penguasa Galaksi Icikiwir", penulis1, fiksi);
        Buku buku32= new Buku("Rendang Menghasut Ambatron", penulis2, fiksi);
        Buku buku33 = new Buku("Perang Kebab", penulis3, fiksi);
        Buku buku34 = new Buku("Kopling Pecinta Alam", penulis4, fiksi);
        Buku buku35 = new Buku("Kopling Pecinta Alam", penulis5, fiksi);
        
        semuaBuku.add(buku1);
        semuaBuku.add(buku2);
        semuaBuku.add(buku3);
        semuaBuku.add(buku4);
        semuaBuku.add(buku5);
        semuaBuku.add(buku6);
        semuaBuku.add(buku7);
        semuaBuku.add(buku8);
        semuaBuku.add(buku9);
        semuaBuku.add(buku10);
        semuaBuku.add(buku11);
        semuaBuku.add(buku12);
        semuaBuku.add(buku13);
        semuaBuku.add(buku14);
        semuaBuku.add(buku15);
        semuaBuku.add(buku16);
        semuaBuku.add(buku17);
        semuaBuku.add(buku18);
        semuaBuku.add(buku19);
        semuaBuku.add(buku20);
        semuaBuku.add(buku21);
        semuaBuku.add(buku22);
        semuaBuku.add(buku23);
        semuaBuku.add(buku24);
        semuaBuku.add(buku25);
        semuaBuku.add(buku26);
        semuaBuku.add(buku27);
        semuaBuku.add(buku28);
        semuaBuku.add(buku29);
        semuaBuku.add(buku30);
        semuaBuku.add(buku31);
        semuaBuku.add(buku32);
        semuaBuku.add(buku33);
        semuaBuku.add(buku34);
        semuaBuku.add(buku35);


        teknologi.tambahBuku(buku1);
        teknologi.tambahBuku(buku2);
        filsafat.tambahBuku(buku3);
        sejarah.tambahBuku(buku4);
        agama.tambahBuku(buku5);
        psikologi.tambahBuku(buku6);
        politik.tambahBuku(buku7);
        fiksi.tambahBuku(buku8);
        fiksi.tambahBuku(buku9);
        fiksi.tambahBuku(buku10);
        fiksi.tambahBuku(buku11);
        fiksi.tambahBuku(buku12);
        fiksi.tambahBuku(buku13);
        fiksi.tambahBuku(buku14);
        fiksi.tambahBuku(buku15);
        fiksi.tambahBuku(buku16);
        fiksi.tambahBuku(buku17);
        fiksi.tambahBuku(buku18);
        fiksi.tambahBuku(buku19);
        fiksi.tambahBuku(buku20);
        fiksi.tambahBuku(buku21);
        fiksi.tambahBuku(buku22);
        fiksi.tambahBuku(buku23);
        fiksi.tambahBuku(buku24);
        fiksi.tambahBuku(buku25);
        fiksi.tambahBuku(buku26);
        fiksi.tambahBuku(buku27);
        fiksi.tambahBuku(buku28);
        fiksi.tambahBuku(buku29);
        fiksi.tambahBuku(buku30);
        fiksi.tambahBuku(buku31);
        fiksi.tambahBuku(buku32);
        fiksi.tambahBuku(buku33);
        fiksi.tambahBuku(buku34);
    }
}
