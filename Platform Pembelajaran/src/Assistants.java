public class Assistant extends Person {
    private String adminId; 
    private int workHours;  // weekly work hours

    public Assistant(int personId, String name, String address, String email, String phoneNumber, String adminId, String department, int workHours) {
        super(personId, name, address, email, phoneNumber); 
        this.adminId = adminId;
        this.department = department;
        this.workHours = workHours;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public void printDetails() {
        super.printDetails();  
        System.out.println("Admin ID: " + adminId);
        System.out.println("Weekly Work Hours: " + workHours);
    }
}
