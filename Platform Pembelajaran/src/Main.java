import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        StudentHandler studentHandler = new StudentHandler();
        PaymentSys paymentSys = new PaymentSys();
        Student std = null;
        Materials mat;
        PowerPoints pp;
        Videos vid;
        Bindonesia bindo = null;
        Binggris bing = null;
        Mathematic maths = null;
        Lecturer lecr = null;
        String name, address, phone, email, currentCourse, currentEducation;
        int nim, personId, age, indS, nimS, swiCont = 0;
        Scanner sc = new Scanner(System.in);
        int swi1, swi2, swi3, swi4, swi5;
        String pass = "12345", username = "admin", logAtt, logAtt1, pass1 = "mao", username1 ="cato";
        boolean men1 = true, men2, men3, men4, men5;

        while (men1) {
            System.out.println("Who are you ? \n1. Student \n2. Lecturer \n3. Assistant \n4. Exit");
            swi1 = sc.nextInt();
            switch (swi1) {
                case 1:
                    System.out.println("Enter your NIM");
                    nim = sc.nextInt();
                    nimS = studentHandler.SeqSearch(nim);
                    if (nim == nimS) {
                        men5 = true;
                        while (men5) {
                            System.out.println("Welcome to our learning platform!");
                            System.out.println("What would you like to do ?");
                            System.out.println("1. View course \n2. View materials from said course \n3. Pay the price... \n4. Exit");
                            swi5 = sc.nextInt();
                            switch (swi5) {
                                case 1:
                                    System.out.println("Enter your index (attendances list): ");
                                    int indStudent = sc.nextInt();
                                    std = studentHandler.get(indStudent-1);
                                    if (std.getCurrentCourse().equalsIgnoreCase("Bahasa Indonesia")) {
                                        bindo.tampilkanKursus();
                                    } else if (std.getCurrentCourse().equalsIgnoreCase("Bahasa Ingriss")) {
                                        bing.tampilkanKursus();
                                    } else if (std.getCurrentCourse().equalsIgnoreCase("Matematika")) {
                                        maths.tampilkanKursus();
                                    }
                                    System.out.println(std.getCurrentCourse());
                                    break;
                                case 2:
                                    System.out.println("What material would you like to see: \n1. Bahasa Indonesia \n2. Bahasa Ingriss \n3. Matematika");
                                    int optMat = sc.nextInt();
                                    switch (optMat) {
                                        case 1:
                                            if (std.getCurrentCourse().equalsIgnoreCase("Bahasa Indonesia")) {
                                                bindo.mat.displayInfo();
                                            } else {
                                                System.out.println("You're not enrolled in this class !");
                                            }
                                            break;
                                        case 2:
                                            if (std.getCurrentCourse().equalsIgnoreCase("Bahasa Ingriss")) {
                                                bing.mat.displayInfo();
                                            } else {
                                                System.out.println("You're not enrolled in this class !");
                                            }
                                        case 3:
                                            if (std.getCurrentCourse().equalsIgnoreCase("Matematika")) {
                                                maths.mat.displayInfo();
                                            } else {
                                                System.out.println("You're not enrolled in this class !");
                                            }
                                            break;
                                    }
                                    break;
                                case 3:
                                    String selectPay;
                                    System.out.println("Payment type ? \n1. Cash \n2. Credit \n3. Debit");
                                    selectPay = switch (sc.nextInt()) {
                                        case 1 -> "Cash";
                                        case 2 -> "Credit";
                                        case 3 -> "Debit";
                                        default -> throw new IllegalStateException("Unexpected value: " + sc.nextInt());
                                    };
                                    System.out.println("Pay accordingly: ");
                                    double pay = sc.nextInt();
                                    System.out.println("Enter the current date");
                                    String date = sc.nextLine();
                                    sc.next();
                                    paymentSys.setPaymentDate(date);
                                    paymentSys.setPaymentType(selectPay);
                                    paymentSys.calculatePayment(pay);
                                    paymentSys.print();
                                    break;
                                case 4:
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
                        if (username1.equals(logAtt) && pass1.equals(logAtt1)) {
                            i = 4;
                            men2 = true;
                            while (men2) {
                                System.out.println("Welcome to our learning platform!");
                                System.out.println("What would you like to do ? \n1. Add materials \n2. View students \n3. Exit");
                                swi2 = sc.nextInt();
                                switch (swi2) {
                                    case 1:
                                        System.out.println("Select on what course you would like add \n1. Bahasa Indonesia \n2. Bahasa Ingriss \n3. Matematika " );
                                        int swiC = sc.nextInt();
                                        switch (swiC) {
                                            case 1: 
                                              System.out.println("What contents would you like to add ? \n1. Materials \n2. Power point \n3. Video");
                                              swiCont = sc.nextInt();
                                                switch (swiCont) {
                                                    case 1:
                                                        System.out.println("Enter the title: ");
                                                        String title = sc.next();
                                                        System.out.println("Enter the description: ");
                                                        String content = sc.next();
                                                        System.out.println("Enter the page count: ");
                                                        int pageCount = sc.nextInt();
                                                        mat = new Materials(title, content, pageCount);
                                                        bindo.mat = mat;
                                                        break;
                                                    case 2:
                                                        System.out.println("Enter the title: ");
                                                        String title1 = sc.next();
                                                        System.out.println("Enter the description: ");
                                                        String content1 = sc.next();
                                                        System.out.println("Enter the page count: ");
                                                        int slideCount = sc.nextInt();
                                                        pp = new PowerPoints(title1, content1, slideCount);
                                                        bindo.pp = pp;
                                                        break;
                                                    case 3:
                                                        System.out.println("Enter the title: ");
                                                        String title2 = sc.next();
                                                        System.out.println("Enter the description: ");
                                                        String content2 = sc.next();
                                                        System.out.println("Enter the duration: ");
                                                        int duration = sc.nextInt();
                                                        vid = new Videos(title2, content2, duration);
                                                        bindo.vid = vid;
                                                        break;
                                                }
                                            break;
                                            case 2:
                                                System.out.println("What contents would you like to add ? \n1. Materials \n2. Power point \n3. Video");
                                                swiCont = sc.nextInt();
                                                switch (swiCont) {
                                                    case 1:
                                                        String title = sc.next();
                                                        String content = sc.next();
                                                        int pageCount = sc.nextInt();
                                                        mat = new Materials(title, content, pageCount);
                                                        bing.mat = mat;
                                                        break;
                                                    case 2:
                                                        String title1 = sc.next();
                                                        String content1 = sc.next();
                                                        int slideCount = sc.nextInt();
                                                        pp = new PowerPoints(title1, content1, slideCount);
                                                        bindo.pp = pp;
                                                        break;
                                                    case 3:
                                                        String title2 = sc.next();
                                                        String content2 = sc.next();
                                                        int duration = sc.nextInt();
                                                        vid = new Videos(title2, content2, duration);
                                                        bindo.vid = vid;
                                                        break;
                                                }
                                                break;
                                            case 3:
                                                switch (swiCont) {
                                                    case 1:
                                                        String title = sc.next();
                                                        String content = sc.next();
                                                        int pageCount = sc.nextInt();
                                                        mat = new Materials(title, content, pageCount);
                                                        maths.mat = mat;
                                                        break;
                                                    case 2:
                                                        String title1 = sc.next();
                                                        String content1 = sc.next();
                                                        int slideCount = sc.nextInt();
                                                        pp = new PowerPoints(title1, content1, slideCount);
                                                        bindo.pp = pp;
                                                        break;
                                                    case 3:
                                                        String title2 = sc.next();
                                                        String content2 = sc.next();
                                                        int duration = sc.nextInt();
                                                        vid = new Videos(title2, content2, duration);
                                                        bindo.vid = vid;
                                                        break;
                                                }
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
                            System.out.println("Invalid username or password" );
                            if (i < 3) {
                                System.out.println("Attempt: "+(i+1));
                            }
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
                            i = 4;
                            men3 = true;
                            while (men3) {
                                System.out.println("Welcome to the admin panel. What would you like to do ? \n1. Open students panel \n2. Edit courses \n3. Edit lecturer \n4. View lecturer \n5. Exit");
                                swi3 = sc.nextInt();
                                switch (swi3) {
                                    case 1:
                                        men4 = true;
                                        studentHandler.menu();
                                        while (men4) {
                                            swi4 = sc.nextInt();
                                            switch (swi4) {
                                                case 1:
                                                    System.out.println("Type in the name: ");
                                                    name = sc.next();
                                                    System.out.println("Type in the address: ");
                                                    address = sc.next();
                                                    System.out.println("Type in the phone number: ");
                                                    phone = sc.next();
                                                    System.out.println("Type in the email: ");
                                                    email = sc.next();
                                                    System.out.println("Type in the age: ");
                                                    age = sc.nextInt();
                                                    System.out.println("Type in the current course: ");
                                                    sc.nextLine();
                                                    currentCourse = sc.nextLine();
                                                    System.out.println("Type in the current education: ");
                                                    currentEducation = sc.next();
                                                    System.out.println("Type in the nim: ");
                                                    nim = sc.nextInt();
                                                    System.out.println("Type in the person id: ");
                                                    personId = sc.nextInt();
                                                    std = new Student(personId, name, address, email, phone, nim, currentEducation, currentCourse,age);
                                                    studentHandler.addFirst(std);
                                                    studentHandler.menu();
                                                    break;
                                                case 2:
                                                    System.out.println("Type in the name: ");
                                                    name = sc.next();
                                                    System.out.println("Type in the address: ");
                                                    address = sc.next();
                                                    System.out.println("Type in the phone number: ");
                                                    phone = sc.next();
                                                    System.out.println("Type in the email: ");
                                                    email = sc.next();
                                                    System.out.println("Type in the age: ");
                                                    age = sc.nextInt();
                                                    System.out.println("Type in the current course: ");
                                                    sc.nextLine();
                                                    currentCourse = sc.nextLine();
                                                    System.out.println("Type in the current education: ");
                                                    currentEducation = sc.next();
                                                    System.out.println("Type in the nim: ");
                                                    nim = sc.nextInt();
                                                    System.out.println("Type in the person id: ");
                                                    personId = sc.nextInt();
                                                    std = new Student(personId, name, address, email, phone, nim, currentEducation, currentCourse,age);
                                                    studentHandler.addFirst(std);
                                                    studentHandler.menu();
                                                    break;
                                                case 3:
                                                    System.out.println("Type in the name: ");
                                                    name = sc.next();
                                                    System.out.println("Type in the address: ");
                                                    address = sc.next();
                                                    System.out.println("Type in the phone number: ");
                                                    phone = sc.next();
                                                    System.out.println("Type in the email: ");
                                                    email = sc.next();
                                                    System.out.println("Type in the age: ");
                                                    age = sc.nextInt();
                                                    System.out.println("Type in the current course: ");
                                                    sc.nextLine();
                                                    currentCourse = sc.nextLine();
                                                    System.out.println("Type in the current education: ");
                                                    currentEducation = sc.next();
                                                    System.out.println("Type in the nim: ");
                                                    nim = sc.nextInt();
                                                    System.out.println("Type in the person id: ");
                                                    personId = sc.nextInt();
                                                    std = new Student(personId, name, address, email, phone, nim, currentEducation, currentCourse,age);
                                                    studentHandler.addFirst(std);
                                                    studentHandler.menu();
                                                    break;
                                                case 4:
                                                    studentHandler.removeFirst();
                                                    studentHandler.menu();
                                                    break;
                                                case 5:
                                                    studentHandler.removeLast();
                                                    studentHandler.menu();
                                                    break;
                                                case 6:
                                                    System.out.println("Type in the index on student that you wanted to remove: ");
                                                    indS = sc.nextInt();
                                                    studentHandler.remove(indS);
                                                    studentHandler.menu();
                                                    break;
                                                case 7:
                                                    studentHandler.print();
                                                    studentHandler.menu();
                                                    break;
                                                case 8:
                                                    System.out.println("Enter the NIM: ");
                                                    nimS = sc.nextInt();
                                                    studentHandler.SeqSearch(nimS);
                                                    studentHandler.menu();
                                                    break;
                                                case 9:
                                                    studentHandler.sortData();
                                                    studentHandler.menu();
                                                    break;
                                                case 10:
                                                    men4 = false;
                                                    break;

                                            }
                                        }

                                        break;
                                    case 2:
                                        System.out.println("Select what courses you would like to edit/add \n1. Bahasa Indonesia \n2. Bahasa Ingriss \n3. Matematika");
                                        int swiCE = sc.nextInt();
                                        switch (swiCE) {
                                            case 1:
                                                System.out.println("Enter the title: ");
                                                sc.nextLine();
                                                String title1 = sc.nextLine();
                                                System.out.println("Enter the description: ");
                                                String desc = sc.next();
                                                System.out.println("Enter the schedule time: ");
                                                String leanTime = sc.next();
                                                System.out.println("Enter the duration: ");
                                                int date = sc.nextInt();
                                                bindo = new Bindonesia(title1, desc, leanTime, date);
                                                System.out.println(bindo.getTitle());
                                                System.out.println(bindo.getDescription());
                                                System.out.println(bindo.gettanggalBelajar());
                                                System.out.println(bindo.getjamBelajar());
                                                break;
                                            case 2:
                                                System.out.println("Enter the title: ");
                                                sc.nextLine();
                                                String title2 = sc.nextLine();
                                                System.out.println("Enter the description: ");
                                                String desc2 = sc.next();
                                                System.out.println("Enter the schedule time: ");
                                                String leanTime2 = sc.next();
                                                System.out.println("Enter the duration: ");
                                                int date2 = sc.nextInt();
                                                bing = new Binggris(title2, desc2, leanTime2, date2);
                                                System.out.println(bing.getTitle());
                                                System.out.println(bing.getDescription());
                                                System.out.println(bing.gettanggalBelajar());
                                                System.out.println(bing.getjamBelajar());
                                                break;
                                            case 3:
                                                System.out.println("Enter the title: ");
                                                sc.nextLine();
                                                String title3 = sc.nextLine();
                                                System.out.println("Enter the description: ");
                                                String desc3 = sc.next();
                                                System.out.println("Enter the schedule time: ");
                                                String leanTime3 = sc.next();
                                                System.out.println("Enter the duration: ");
                                                int date3 = sc.nextInt();
                                                maths = new Mathematic(title3, desc3, leanTime3, date3);
                                                System.out.println(maths.getTitle());
                                                System.out.println(maths.getDescription());
                                                System.out.println(maths.gettanggalBelajar());
                                                System.out.println(maths.getjamBelajar());
                                                break;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Type in the name: ");
                                        name = sc.next();
                                        System.out.println("Type in the address: ");
                                        address = sc.next();
                                        System.out.println("Type in the phone number: ");
                                        phone = sc.next();
                                        System.out.println("Type in the email: ");
                                        email = sc.next();
                                        System.out.println("Type in the age: ");
                                        age = sc.nextInt();
                                        System.out.println("Type in the person id: ");
                                        personId = sc.nextInt();
                                        System.out.println("Enter the area of expertise: ");
                                        String areaExpert = sc.next();
                                        System.out.println("Enter profession: ");
                                        String profession = sc.next();
                                        lecr = new Lecturer(personId, name, address, email, phone, profession, areaExpert, age);
                                        break;
                                    case 4:
                                        lecr.printDetails();
                                        break;
                                    case 5:
                                        men3 = false;
                                        break;
                                    default:
                                        throw new IllegalStateException("Unexpected value: " + swi3);
                                }
                            }
                        } else {
                            System.out.println("Invalid username or password " );
                            if (i < 3) {
                                System.out.println("Attempt :" + (i+1));
                            }
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