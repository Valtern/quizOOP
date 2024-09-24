public class Mathematic extends Course {
    Materials mat;
    PowerPoints pp;
    Videos vid;

    public Mathematic(String title, String description, int jamMengajar, int tanggalBelajar) {
        super(title, description, jamMengajar, tanggalBelajar);
    }

    public void tampilkanKursus() {
        System.out.println("Kursus Matematika: " + getTitle());
        super.tampilkanKursus();
    }
}
