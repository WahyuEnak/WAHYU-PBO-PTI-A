public class InternEmployee extends Employee implements Contract {
    private int contractDuration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int contractDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.contractDuration = contractDuration;
    }

    // Implementasi metode abstract dari superclass Employee
    @Override
    public void work() {
        System.out.println("Intern sedang bekerja...");
    }

    // Implementasi metode abstract dari interface Contract
    @Override
    public int getContractDuration() {
        return contractDuration;
    }

    @Override
    public void attendTrainingSession(String trainingTopic) {
        System.out.println(getName() + " is attending training session on " + trainingTopic);
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Contract duration of " + getName() + " is " + contractDuration + " months.");
    }

    // Metode unik dari kelas InternEmployee
    public void submitReport(String reportTitle) {
        System.out.println(getName() + " is submitting internship report: " + reportTitle);
    }

    public void attendInternshipOrientation() {
        System.out.println(getName() + " is attending internship orientation.");
    }
}
