public class Person {
    private int personId;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    
    public Person(int personId, String name, String address, String email, String phoneNumber) {
        this.personId = personId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);

        if (nim != null) {
            System.out.println("NIM: " + nim);  // For students
        }
        
        if (profession != null) {
            System.out.println("Profession: " + profession);  // For lecturers/assistants
        }
    }
}
