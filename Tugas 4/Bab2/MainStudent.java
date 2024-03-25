public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        System.out.println("===================");

        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        System.out.println("===================");

        Student anna2 = new Student("Anna", "Batu", 18);
        anna2.displayMessage();

        System.out.println("===================");

        Student chris2 = new Student("Chris", "Surabaya", 22, 70, 60, 90);
        chris2.displayMessage();

        // Memanggil method jumlahObjek untuk menampilkan jumlah objek yang dibuat
        Student.jumlahObjek();
    }
}
