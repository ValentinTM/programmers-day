import java.util.Scanner;
import java.util.Calendar;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();


        if (isLeapYear(year)) {
            System.out.println("12.09." + year + " День программиста! Високосный год.");
        } else {
            System.out.println("13.09." + year + " День программиста! Год не високосный!");
        }

    }

    public static boolean isLeapYear(int year) {
//        if (year % 4 != 0) {
//            return false;
//        } else if (year % 400 == 0) {
//            return true;
//        } else if (year % 100 == 0) {
//            return false;
//        } else {
//            return true;
//        }
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;

    }
}