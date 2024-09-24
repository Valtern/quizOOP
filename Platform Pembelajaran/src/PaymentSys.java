public class PaymentSys {
    private String nama;
    private String alamat;
    private int kodePembayaran;
    private String jenisPembayaran;
    private int tanggalPembayaran;
    private int totalPembayaran;

    PaymentSys(String nama, String alamat, int kodePembayaran, String jenisPembayaran, int totalPembayaran, int tanggalPembayaran) {
        this.nama = nama;
        this.alamat = alamat;
        this.kodePembayaran = kodePembayaran;
        this.jenisPembayaran = jenisPembayaran;
        this.totalPembayaran = totalPembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }
    public void setKodePembayaran(int kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }
    public void setJenisPembayaran (String jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }
    public void setTotalPembayaran(int totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }
    public void setTanggalPembayaran (int tanggalPembayaran) {
        this.tanggalPembayaran  = tanggalPembayaran;
    }

    public void calculatePayment () {

    }




    public void print() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Kode pembayaran: " + this.kodePembayaran);
        System.out.println("Jenis pembayaran: " + this.jenisPembayaran);
        System.out.println("Total Pembayaran: " + this.totalPembayaran);
        System.out.println("Tanggal Pembayaran: " + this.tanggalPembayaran);
    }
}
