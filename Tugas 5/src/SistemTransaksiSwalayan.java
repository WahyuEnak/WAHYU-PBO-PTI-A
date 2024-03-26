class SistemTransaksiSwalayan {
    private Map<String, Pelanggan> pelangganMap;

    public SistemTransaksiSwalayan() {
        this.pelangganMap = new HashMap<>();
        // Dummy data
        pelangganMap.put("3801234567", new Pelanggan("3801234567", "Slamet Kopling", 20000));
        pelangganMap.put("5602345678", new Pelanggan("5602345678", "Farhan Kebab", 1500000));
        pelangganMap.put("7403456789", new Pelanggan("7403456789", "Kevin Lontong", 5000000));
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
                    prosesTransaksi(pelanggan);
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
        if (pelanggan != null && pelanggan.getPercobaanAutentikasi() < 3) {
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
            pelanggan.setSaldo(saldoBaru);
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

public class Main {
    public static void main(String[] args) {
        SistemTransaksiSwalayan sistem = new SistemTransaksiSwalayan();
        sistem.mulai();
    }
}
