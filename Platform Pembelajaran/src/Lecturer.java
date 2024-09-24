public class Lecturer extends Person {
    private String profession;
    private String expertiseArea;

    Lecturer(int personId, String name, String address, String email, String phoneNumber, String profession, String expertiseArea, int age) {
        super(personId, name, address, email, phoneNumber, age);  // Calls the Person constructor
        this.profession = profession;
        this.expertiseArea = expertiseArea;
    }

    // Getters and Setters 
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }
    @Override
    public void printDetails() {
        super.printDetails();  
        System.out.println("Profession: " + profession);
        System.out.println("Expertise Area: " + expertiseArea);
    }
}
