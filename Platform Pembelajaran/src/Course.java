public class Course {

    Materials mat;
    PowerPoints pp;
    Videos vid;

    private String title;
    private String description;
    private int jamBelajar;
    private int tanggalBelajar;

    public Course(String title, String description, int jamBelajar, int tanggalBelajar) {
        this.title = title;
        this.description = description;
        this.jamBelajar = jamBelajar;
        this.tanggalBelajar =tanggalBelajar;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getjamBelajar(){
        return jamBelajar;
    }

    public int gettanggalBelajar(){
        return tanggalBelajar;
    }

    public void tampilkanKursus() {
        System.out.println("Kursus: " + title);
        System.out.println("Deskripsi: " + description);
        System.out.println("Jam Mengajar: " + jamBelajar + " jam");
        System.out.println("Tanggal Belajar: " + tanggalBelajar);
    }
}
