import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StudentHandler studentHandler = new StudentHandler();
        Student std;
        String name = "", address = "", phone = "", email = "", currentCourse = "", currentEducation = "";
        int nim = 0, personId = 0, age = 0, indS = -1, nimS;
        Scanner sc = new Scanner(System.in);
        int swi1 = -1, swi2 = -1, swi3 = -1, swi4 = -1;
        String pass = "12345", username = "admin", logAtt = "", logAtt1 = "";
        boolean men1 = true, men2 = true, men3 = true, men4 = true;

        while (men1) {
            men1 = true;
            System.out.println("Who are you ? \n1. Student \n2. Lecturer \n3. Assistant \n4. Exit");
            swi1 = sc.nextInt();
            switch (swi1) {
                case 1:
                    System.out.println("Welcome to our learning platform!");
                    System.out.println("What would you like to do ?");
                    break;
                case 2:
                    System.out.println("Enter your username and password");
                    for (int i = 0; i <= 3; i++) {
                        logAtt = sc.next();
                        logAtt1 = sc.next();
                        if (username.equals(logAtt) && pass.equals(logAtt1)) {
                            while (men2) {
                                System.out.println("Welcome to our learning platform!");
                                System.out.println("What would you like to do ? \n1. Add materials \n2. View students \n3. Edit student \n4. Exit");
                                swi2 = sc.nextInt();
                                switch (swi2) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        men2 = false;
                                        break;

                                }
                            }
                        } else {
                            System.out.println("Invalid username or password \nAttempt " + i);
                        }
                    }
                    System.out.println("Sorry, maximum attempt reached.");
                    break;
                case 3:
                    System.out.println("Enter your username and password");
                    for (int i = 0; i <= 3; i++) {
                        logAtt = sc.next();
                        logAtt1 = sc.next();
                        if (username.equals(logAtt) && pass.equals(logAtt1)) {
                            while (men3) {
                                System.out.println("Welcome to the admin panel. What would you like to do ? \n1. Open students panel \n2. Edit courses \n3. Edit lecturer \n4. Exit");
                                swi3 = sc.nextInt();
                                switch (swi3) {
                                    case 1:
                                        while (men4) {
                                            studentHandler.print();
                                            swi4 = sc.nextInt();
                                            switch (swi4) {
                                                case 1:
                                                    System.out.println("Type in the name: ");
                                                    name = sc.nextLine();
                                                    sc.next();
                                                    System.out.println("Type in the address: ");
                                                    address = sc.nextLine();
                                                    sc.next();
                                                    System.out.println("Type in the phone number: ");
                                                    phone = sc.nextLine();
                                                    System.out.println("Type in the email: ");
                                                    email = sc.nextLine();
                                                    System.out.println("Type in the age: ");
                                                    age = sc.nextInt();
                                                    System.out.println("Type in the current course");
                                                    currentCourse = sc.nextLine();
                                                    System.out.println("Type in the current education");
                                                    currentEducation = sc.nextLine();
                                                    System.out.println("Type in the nim: ");
                                                    nim = sc.nextInt();
                                                    System.out.println("Type in the person id: ");
                                                    personId = sc.nextInt();
                                                    std = new Student(personId, name, address, email, phone, nim, currentEducation, currentCourse,age );
                                                    studentHandler.addFirst(std);
                                                    break;
                                                case 2:
                                                    System.out.println("Type in the name: ");
                                                    name = sc.nextLine();
                                                    sc.next();
                                                    System.out.println("Type in the address: ");
                                                    address = sc.nextLine();
                                                    sc.next();
                                                    System.out.println("Type in the phone number: ");
                                                    phone = sc.nextLine();
                                                    System.out.println("Type in the email: ");
                                                    email = sc.nextLine();
                                                    System.out.println("Type in the age: ");
                                                    age = sc.nextInt();
                                                    System.out.println("Type in the current course");
                                                    currentCourse = sc.nextLine();
                                                    System.out.println("Type in the current education");
                                                    currentEducation = sc.nextLine();
                                                    System.out.println("Type in the nim: ");
                                                    nim = sc.nextInt();
                                                    System.out.println("Type in the person id: ");
                                                    personId = sc.nextInt();
                                                    std = new Student(personId, name, address, email, phone, nim, currentEducation, currentCourse,age );
                                                    studentHandler.addLast(std);
                                                    break;
                                                case 3:
                                                    System.out.println("Type in the name: ");
                                                    name = sc.nextLine();
                                                    sc.next();
                                                    System.out.println("Type in the address: ");
                                                    address = sc.nextLine();
                                                    sc.next();
                                                    System.out.println("Type in the phone number: ");
                                                    phone = sc.nextLine();
                                                    System.out.println("Type in the email: ");
                                                    email = sc.nextLine();
                                                    System.out.println("Type in the age: ");
                                                    age = sc.nextInt();
                                                    System.out.println("Type in the current course");
                                                    currentCourse = sc.nextLine();
                                                    System.out.println("Type in the current education");
                                                    currentEducation = sc.nextLine();
                                                    System.out.println("Type in the nim: ");
                                                    nim = sc.nextInt();
                                                    System.out.println("Type in the person id: ");
                                                    personId = sc.nextInt();
                                                    std = new Student(personId, name, address, email, phone, nim, currentEducation, currentCourse,age);
                                                    System.out.println("Type in the index you would like the student to be in: ");
                                                    indS = sc.nextInt();
                                                    studentHandler.add(std, indS);
                                                    break;
                                                case 4:
                                                    studentHandler.removeFirst();
                                                    break;
                                                case 5:
                                                    studentHandler.removeLast();
                                                    break;
                                                case 6:
                                                    System.out.println("Type in the index on student that you wanted to remove: ");
                                                    indS = sc.nextInt();
                                                    studentHandler.remove(indS);
                                                    break;
                                                case 7:
                                                    studentHandler.print();
                                                    break;
                                                case 8:
                                                    System.out.println("Enter the NIM: ");
                                                    nimS = sc.nextInt();
                                                    studentHandler.get(nim);
                                                    break;
                                                case 9:
                                                    studentHandler.sortData();
                                                    break;
                                                case 10:
                                                    men4 = false;
                                                    break;

                                            }
                                        }

                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        men3 = false;
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Invalid username or password \nAttempt " + i);
                        }
                    }
                    System.out.println("Sorry, maximum attempt reached.");
                    break;
                case 4:
                    men1 = false;
                    break;
            }

        }

    }
}