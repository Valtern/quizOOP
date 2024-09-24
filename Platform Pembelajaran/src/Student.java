public class Student extends Person {
    private String nim; 
    private String currentEducation;
    private String currentCourse;

    public Student(int personId, String name, String address, String email, String phoneNumber, String nim, String currentEducation, String currentCourse) {
        super(personId, name, address, email, phoneNumber);  // Calls the Person constructor
        this.nim = nim;
        this.currentEducation = currentEducation;
        this.currentCourse = currentCourse;
    }


    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getCurrentEducation() {
        return currentEducation;
    }

    public void setCurrentEducation(String currentEducation) {
        this.currentEducation = currentEducation;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }

    @Override
    public void printDetails() {
        super.printDetails();  // Prints details from the Person class
        System.out.println("NIM: " + nim);
        System.out.println("Current Education: " + currentEducation);
        System.out.println("Current Course: " + currentCourse);
    }
}