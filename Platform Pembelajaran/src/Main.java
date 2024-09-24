import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StudentHandler studentHandler = new StudentHandler();
        Student std;
        String name = "", address = "", phone = "", email = "", currentCourse = "", currentEducation = "";
        int nim = 0, personId = 0, age = 0, indS = -1, nimS;
        Scanner sc = new Scanner(System.in);
        int swi1 = -1, swi2 = -1, swi3 = -1, swi4 = -1, swi5 = -1;
        String pass = "12345", username = "admin", logAtt = "", logAtt1 = "";
        boolean men1 = true, men2 = true, men3 = true, men4 = true, men5 = true;


        while (men1) {
            System.out.println("Who are you ? \n1. Student \n2. Lecturer \n3. Assistant \n4. Exit");
            swi1 = sc.nextInt();
            switch (swi1) {
                case 1:
                    System.out.println("Enter your NIM");
                    nimS = studentHandler.SeqSearch(nim);
                    if (nim ==  nimS) {
                        System.out.println("Welcome to our learning platform!");
                        System.out.println("What would you like to do ?");
                        System.out.println("1. View course \n2. View materials from said course \n3. Pay the price... \n4. Exit");
                        men5 = true;
                        while (men5) {
                            swi5 = sc.nextInt();
                            switch (swi5) {
                                case 1:
                                    System.out.println("Enter your index (attendances list): ");
                                    int indStudent = sc.nextInt();
                                    std = studentHandler.get(indStudent);
                                    System.out.println(std.getCurrentCourse());
                                    break;
                                case 2:
                                    System.out.println("What material would you like to see: ");
                                    break;
                                case 3:
                                    men5 = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid NIM!");
                    }
                    break;
                case 2:
                    System.out.println("Enter your username and password");
                    for (int i = 0; i <= 3; i++) {
                        logAtt = sc.next();
                        logAtt1 = sc.next();
                        if (username.equals(logAtt) && pass.equals(logAtt1)) {
                            men2 = true;
                            while (men2) {
                                System.out.println("Welcome to our learning platform!");
                                System.out.println("What would you like to do ? \n1. Add materials \n2. View students \n3. Exit");
                                swi2 = sc.nextInt();
                                switch (swi2) {
                                    case 1:
                                        System.out.println("Select on what course you would like add \n1.Contents \n2. Materials \n3.Video " );
                                        int swiC = sc.nextInt();
                                        switch (swiC) {
                                            case 1:
                                                String title = sc.next();
                                                String content = sc.next();
                                                int pageCount = sc.nextInt();
                                                Materials mat = new Materials(title, content, pageCount);
                                                break;
                                            case 2:
                                                String title1 = sc.next();
                                                String content1 = sc.next();
                                                int slideCount = sc.nextInt();
                                                PowerPoints pp = new PowerPoints(title1, content1, slideCount);
                                                break;
                                            case 3:
                                                String title2 = sc.next();
                                                String content2 = sc.next();
                                                int duration = sc.nextInt();
                                                Videos vd = new Videos(title2, content2, duration);
                                                break;
                                        }
                                        break;
                                    case 2:
                                        studentHandler.print();
                                        break;
                                    case 3:
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
                            men3 = true;
                            while (men3) {

                                System.out.println("Welcome to the admin panel. What would you like to do ? \n1. Open students panel \n2. Edit courses \n3. Edit lecturer \n4. Exit");
                                swi3 = sc.nextInt();
                                switch (swi3) {
                                    case 1:
                                        men4 = true;
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
                                        System.out.println("Select what courses you would like to edit \n1. Bahasa Indonesia \n2. Bahasa Ingriss \n3. Matematika");
                                        int swiCE = sc.nextInt();
                                        switch (swiCE) {
                                            case 1:
                                                String title1 = sc.next();
                                                String desc = sc.next();
                                                int leanTime = sc.nextInt();
                                                int date = sc.nextInt();
                                                Bindonesia bindo = new Bindonesia(title1, desc, leanTime, date);
                                                break;
                                            case 2:
                                                String title2 = sc.next();
                                                String desc2 = sc.next();
                                                int leanTime2 = sc.nextInt();
                                                int date2 = sc.nextInt();
                                                Binggris bing = new Binggris(title2, desc2, leanTime2, date2);
                                                break;
                                            case 3:
                                                String title3 = sc.next();
                                                String desc3 = sc.next();
                                                int leanTime3 = sc.nextInt();
                                                int date3 = sc.nextInt();
                                                Mathematic math = new Mathematic(title3, desc3, leanTime3, date3);
                                                break;
                                        }
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
                                        System.out.println("Type in the person id: ");
                                        personId = sc.nextInt();
                                        System.out.println("Enter the area of expertise: ");
                                        String areaExpert = sc.next();
                                        System.out.println("Enter profession: ");
                                        String profession = sc.next();
                                        Lecturer lecr = new Lecturer(personId, name, address, email, phone, profession, areaExpert, age);
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