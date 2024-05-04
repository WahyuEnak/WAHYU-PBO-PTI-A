import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, LocalDate.of(1990, 5, 3));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, LocalDate.of(1995, 3, 15));
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, LocalDate.of(1988, 10, 12));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, LocalDate.of(1992, 7, 20));
        
        Upah productionEmployee = new Upah("Slamet Kopling", "911", 10.0, 1000, LocalDate.of(2078, 11, 12));

        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee, productionEmployee};

        System.out.println("Pengolahan Gaji secara Polimorfisme:\n");

        for (Employee employee : employees) {
            double earnings = employee.earnings();

            // Cek jika bulan ini adalah bulan ulang tahunnya
            if (employee.getBirthDate().getMonth() == today.getMonth() &&
                    employee.getBirthDate().getDayOfMonth() == today.getDayOfMonth()) {
                earnings += 100000; // Tambahkan bonus 100.000 jika ulang tahun
            }

            System.out.println(employee);
            System.out.printf("Pendapatan: $%,.2f\n\n", earnings);
        }

    }
}
