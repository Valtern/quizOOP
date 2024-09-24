public class Course {
    private String kursusSoftware;
    private String kursusMaketing;
    private String kursusSeller;

    Course () {

    }

    Course (String kursusSoftware, String kursusMarketing, String kursusSeller ){
        this.kursusSoftware = kursusSoftware;
        this.kursusMaketing = kursusMarketing;
        this.kursusSeller = kursusSeller;
    }

    public void setkursusSoftware (String kursusSoftware){
        this.kursusSoftware = kursusSoftware;
    }

    public void setkursusMarketing (String kursusMarketing){
        this.kursusMaketing = kursusMarketing;
    }

    public void setkursusSeller (String kursusSeller){
        this.kursusSeller = kursusSeller;
    }

    public void print (){
        System.out.println("Kursus Software  : " + kursusSoftware);
        System.out.println("Kursus Marketing : " + kursusMaketing);
        System.out.println("Kursus Seller  : " + kursusSeller);
    }





}
