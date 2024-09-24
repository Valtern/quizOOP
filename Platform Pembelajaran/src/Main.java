import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int swi1 = -1, swi2 = -1, swi3 = -1;
        String pass = "12345", username = "admin", logAtt = "", logAtt1 = "";
        boolean men1 = true, men2 = true, men3 = true;

        while (men1) {
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
                                System.out.println("What would you like to do ? \n1. Assign materials \n2. View students \n3. Edit student \n4. Exit");
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