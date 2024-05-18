public class PermanentEmployee extends Employee {
    private String department;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String department) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.department = department;
    }

    // Implementasi metode abstract dari superclass Employee
    @Override
    public void work() {
        System.out.println("Karyawan tetap sedang bekerja...");
    }

    // Metode unik dari kelas PermanentEmployee
    public void manageTeam() {
        System.out.println(getName() + " is managing the " + department + " team.");
    }

    public void conductPerformanceReview() {
        System.out.println(getName() + " is conducting performance review for the team.");
    }

    public void printEmployeeInfo() {
        System.out.println("Employee ID: " + getRegistrationNumber());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Salary Per Month: Rp." + getSalaryPerMonth());
    }

    public void calculateBonus(double bonusPercentage) {
        double bonus = getSalaryPerMonth() * (bonusPercentage / 100);
        System.out.println("Bonus: $" + bonus);
    }
}
