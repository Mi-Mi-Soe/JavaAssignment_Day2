package TestingControlStatement;

import java.util.Scanner;


/**
 * @author 95977
 *
 */
interface Artist {
    public void doWhat();
}

class Painter implements Artist {
    public void doWhat() {
        System.out.println("Writing pictures");
    }
}

//Abstract Class
abstract class LanguageSchool {

    public int noOfStudent(int num) {
        return num;
    }

    protected void teach() {
        System.out.println("weekends are dayoff");
    }

    public abstract void teachLanguage();
}

class EnglishSchool extends LanguageSchool {
    String language = "English";

    public void teachLanguage() {
        System.out.println("English is only available.");
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Abstract class testing
        EnglishSchool engSc = new EnglishSchool();
        engSc.teach();
        engSc.teachLanguage();
        System.out.println(engSc.noOfStudent(20));
        // Testing interface class
        Painter pa = new Painter();
        pa.doWhat();

        // Testing nested if statement
        int num1 = 5;
        int num2 = 8;
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " is equal.");
        }

        // Testing switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month  : ");
        String month = sc.nextLine();
        switch (month) {
        case "april":
        case "june":
        case "september":
        case "november":
            System.out.println(month + " has 30 days ");
            break;
        case "january":
        case "march":
        case "may":
        case "july":
        case "august":
        case "october":
            System.out.println(month + " has 31 days ");
            break;
        case "february":
            System.out.println(month + " has 28 days ");
            break;
        default:
            System.out.println("Invalid month");
            break;
        }

        // Testing for loop
        System.out.print("Odd numbers - ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("");
        // Testing for each loop
        String[] music = { "pop", "rock", "hip-hop", "classical" };
        System.out.print("Type of music - ");
        for (String song : music) {
            System.out.print(song + " ");
        }
        System.out.println("");

        // Testing do-while loop
        int i = 1;
        System.out.print("Number less than 10 - ");
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 10);
    }
}
