public class Main {
    public static void main(String[] args) {
        // Membuat objek PermanentEmployee
        Invoice[] permanentInvoices = {new Invoice("Laptop", 1, 1200), new Invoice("Printer", 1, 300)};
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Slamet  Kopling", 2500, permanentInvoices, "IT");

        // Menghitung total harga belanjaan dari permanentEmployee
        double totalPurchasePermanent = calculateTotalPurchase(permanentEmployee.getInvoices());

        // Mengurangkan total harga belanjaan dari gaji permanentEmployee
        double payableAmountPermanent = permanentEmployee.getPayableAmount() - totalPurchasePermanent;

        // Menampilkan informasi dan total gaji permanentEmployee setelah dipotong hutang belanjaan
        System.out.println("--- Informasi Permanent Employee ---");
        permanentEmployee.printEmployeeInfo();
        System.out.println("Total belanja: Rp." + totalPurchasePermanent);
        System.out.println("Bayaran setelah potongan: Rp." + payableAmountPermanent);

        System.out.println();

        // Membuat objek InternEmployee
        Invoice[] internInvoices = {new Invoice("Buku", 5, 20)};
        InternEmployee internEmployee = new InternEmployee(202, "Sigit Rendang", 1000, internInvoices, 6);

        // Menghitung total harga belanjaan dari internEmployee
        double totalPurchaseIntern = calculateTotalPurchase(internEmployee.getInvoices());

        // Mengurangkan total harga belanjaan dari gaji internEmployee
        double payableAmountIntern = internEmployee.getPayableAmount() - totalPurchaseIntern;

        // Menampilkan informasi dan total gaji internEmployee setelah dipotong hutang belanjaan
        System.out.println("--- Informasi Intern Employee ---");
        internEmployee.printEmployeeInfo();
        System.out.println("Total belanja: Rp." + totalPurchaseIntern);
        System.out.println("Bayaran setelah potongan: Rp." + payableAmountIntern);
    }

    // Method untuk menghitung total harga belanjaan
    private static double calculateTotalPurchase(Invoice[] invoices) {
        double totalPurchase = 0;
        for (Invoice invoice : invoices) {
            totalPurchase += invoice.getPayableAmount();
        }
        return totalPurchase;

        
    }
}
