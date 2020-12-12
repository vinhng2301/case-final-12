package program;

import model.RegexForms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Menu extends RegexForms {

    public static void getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm, dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Today is: " + dtf.format(now));
    }

    public static void showMenu(){
        System.out.println("----------Menu---------");
        System.out.println("1: ADD EMPLOYEE");
        System.out.println("2: VIEW EMPLOYEES LIST");
        System.out.println("3: DELETE EMPLOYEE");
        System.out.println("4: EDIT EMPLOYEES VIA ID");
        System.out.println("5: SAVE INTO FILE");
        System.out.println("0: EXIT !!");
        System.out.println("-------------------------------------");
        String choice = sc.nextLine();
        switch (choice){
            case "0":
                System.exit(0);
                break;
            case "1":

        }
    }
}
