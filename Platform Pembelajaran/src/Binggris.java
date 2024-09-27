public class Binggris extends Course {
    Materials mat;
    Quiz pp;
    Videos vid;

    public Binggris (String title, String description, String jamMengajar, int tanggalBelajar) {
        super(title, description, jamMengajar, tanggalBelajar);
    }

    public void tampilkanKursus() {
        System.out.println("Bahasa ingriss course: " + getTitle());
        super.tampilkanKursus();
    }

}
