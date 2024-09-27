public class Bindonesia extends Course {
    Materials mat;
    PowerPoints pp;
    Videos vid;

    public Bindonesia(String title, String description, String jamMengajar, int tanggalBelajar) {
        super(title, description, jamMengajar, tanggalBelajar);
    }

    public void tampilkanKursus() {
        System.out.println("Bahasan indonesia course: " + getTitle());
        super.tampilkanKursus();
    }

}
