public class Binggris extends Course {
    public Binggris (String title, String description, int jamMengajar, int tanggalBelajar) {
        super(title, description, jamMengajar, tanggalBelajar);
    }

    public void tampilkanKursus() {
        System.out.println("Kursus Matematika: " + getTitle());
        super.tampilkanKursus();
    }

}
