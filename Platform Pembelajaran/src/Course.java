public class Course {

    Materials mat;
    Quiz pp;
    Videos vid;

    private String title;
    private String description;
    private String jamBelajar;
    private int tanggalBelajar;

    public Course(String title, String description, String jamBelajar, int tanggalBelajar) {
        this.title = title;
        this.description = description;
        this.jamBelajar = jamBelajar;
        this.tanggalBelajar =tanggalBelajar;
    }

    Course () {

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getjamBelajar(){
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
