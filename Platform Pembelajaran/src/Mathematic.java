public class Mathematic extends Course { 
public Mathematic(String title, String description, int jamMengajar, int tanggalBelajar) {
        super(title, description, jamMengajar, tanggalBelajar);
    }

    public void tampilkanKursus() {
        System.out.println("Kursus Matematika: " + getTitle());
        super.tampilkanKursus();
    }
}
// Matematika mathCourse = new Matematika("Algebra Dasar", "Belajar tentang persamaan dan fungsi.", 3.00, 24112004);