public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());
        System.out.println();

        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println("R1 < R2 : " + R1.lessThan(R2));
        System.out.println("R1 >= R2 : " + R1.greaterThanOrEqual(R2));
        System.out.println("R1 <= R2 : " + R1.lessThanOrEqual(R2));
        System.out.println();

        System.out.println("R2 : ");
        R1.cetak();
        System.out.println("R2 : ");
        R2.cetak();
        System.out.println();

        R1.Sederhana();
        R2.Sederhana();

        System.out.println("R1 : ");
        R1.cetak();
        System.out.println("R2 : ");
        R2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        Rasional result = R1.subtract(R2);
        System.out.println("Hasil pengurangan R1 - R2 : ");
        result.cetak();
        System.out.println();

        result = R1.multiply(R2);
        System.out.println("Hasil perkalian R1 * R2 : ");
        result.cetak();
        System.out.println();

        result = R1.divide(R2);
        System.out.println("Hasil pembagian R1 / R2 : ");
        result.cetak();
        System.out.println();
    }
}
