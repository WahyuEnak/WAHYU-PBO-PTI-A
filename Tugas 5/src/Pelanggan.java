import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int percobaanAutentikasi;
    private boolean diblokir;

    public Pelanggan(String nomorPelanggan, String nama, double saldo) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.percobaanAutentikasi = 0;
        this.diblokir = false;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean tambahSaldo(double jumlah) {
        if (jumlah >= 0) {
            saldo += jumlah;
            return true;
        }
        return false;
    }

    public boolean tarikSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public int getPercobaanAutentikasi() {
        return percobaanAutentikasi;
    }

    public void tambahPercobaanAutentikasi() {
        percobaanAutentikasi++;
        if (percobaanAutentikasi >= 3) {
            diblokir = true;
            System.out.println("Akun Anda telah diblokir karena terlalu banyak percobaan autentikasi yang gagal.");
        }
    }

    public boolean isDiblokir() {
        return diblokir;
    }
}

class SistemTransaksiSwalayan {
    private Map<String, Pelanggan> pelangganMap;

    public SistemTransaksiSwalayan() {
        this.pelangganMap = new HashMap<>();
        // Dummy data
        pelangganMap.put("3801234567", new Pelanggan("3801234567", "John Doe", 20000));
        pelangganMap.put("5602345678", new Pelanggan("5602345678", "Jane Smith", 1500000));
        pelangganMap.put("7403456789", new Pelanggan("7403456789", "Alice Johnson", 5000000));
    }

    public void mulai() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Transaksi Swalayan Tiny");

        while (true) {
            System.out.println("\nSilakan masukkan nomor pelanggan Anda:");
            String nomorPelanggan = scanner.nextLine();

            System.out.println("Silakan masukkan PIN Anda:");
            String pin = scanner.nextLine();

            if (autentikasi(nomorPelanggan, pin)) {
                Pelanggan pelanggan = pelangganMap.get(nomorPelanggan);
                if (pelanggan != null) {
                    if (!pelanggan.isDiblokir()) {
                        prosesTransaksi(pelanggan);
                    } else {
                        System.out.println("Awokwowk kena blokir. Silakan hubungi layanan pelanggan.");
                    }
                } else {
                    System.out.println("Nomor pelanggan tidak valid.");
                }
            } else {
                System.out.println("Nomor pelanggan atau PIN tidak valid.");
            }
        }
    }

    private boolean autentikasi(String nomorPelanggan, String pin) {
        Pelanggan pelanggan = pelangganMap.get(nomorPelanggan);
        if (pelanggan != null && !pelanggan.isDiblokir()) {
            if (isValidPIN(nomorPelanggan, pin)) {
                pelanggan.tambahPercobaanAutentikasi();
                return true;
            } else {
                pelanggan.tambahPercobaanAutentikasi();
            }
        }
        return false;
    }

    private boolean isValidPIN(String nomorPelanggan, String pin) {
        // Implementasi sederhana, ganti dengan logika validasi PIN yang sesungguhnya
        return true;
    }

    private void prosesTransaksi(Pelanggan pelanggan) {
        System.out.println("\nSelamat datang, " + pelanggan.getNama() + "!");
        System.out.println("Saldo Anda saat ini: Rp" + pelanggan.getSaldo());

        // Proses transaksi sederhana
        double jumlahPembelian = 1200000; // Contoh jumlah pembelian
        double cashback = hitungCashback(pelanggan, jumlahPembelian);

        double saldoBaru = pelanggan.getSaldo() - jumlahPembelian + cashback;
        if (saldoBaru >= 10000) {
            pelanggan.tambahSaldo(cashback); // Menambah saldo dengan cashback
            System.out.println("Transaksi berhasil!");
            System.out.println("Cashback: Rp" + cashback);
            System.out.println("Saldo baru: Rp" + pelanggan.getSaldo());
        } else {
            System.out.println("Transaksi gagal karena saldo tidak mencukupi.");
        }
    }

    private double hitungCashback(Pelanggan pelanggan, double jumlahPembelian) {
        String jenisAkun = pelanggan.getNomorPelanggan().substring(0, 2);
        double persentaseCashback;
        if (jumlahPembelian > 1000000) {
            switch (jenisAkun) {
                case "38":
                    persentaseCashback = 0.05;
                    break;
                case "56":
                    persentaseCashback = 0.07;
                    break;
                case "74":
                    persentaseCashback = 0.10;
                    break;
                default:
                    persentaseCashback = 0.0;
            }
        } else {
            switch (jenisAkun) {
                case "38":
                    persentaseCashback = 0.0;
                    break;
                case "56":
                    persentaseCashback = 0.02;
                    break;
                case "74":
                    persentaseCashback = 0.05;
                    break;
                default:
                    persentaseCashback = 0.0;
            }
        }
        return jumlahPembelian * persentaseCashback;
    }
}

