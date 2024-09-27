public class Mathematic extends Course {
    Materials mat;
    Quiz pp;
    Videos vid;

    public Mathematic(String title, String description, String jamMengajar, int tanggalBelajar) {
        super(title, description, jamMengajar, tanggalBelajar);
    }

    public void tampilkanKursus() {
        System.out.println("Kursus Matematika: " + getTitle());
        super.tampilkanKursus();
    }
}
