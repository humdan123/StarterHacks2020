package cycleapp;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;

import javax.swing.JOptionPane;

public class CurrentDate {

    public static void main(String[] args) {

        int day, month;

        day = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the day of the month? (Format: d or dd)"));
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the current month? (Format: M or MM)"));
       // year = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the current year? (Format: YYYY)"));

        System.out.println(convertDatetoDay(month, day));
        System.out.println(convertDaytoDate(36));
       
    }

    public static int convertDatetoDay(int month, int day) {

        if (month == 1) {
            return day;
        }
        else if (month == 2) {
            return 31 + day;
        }
        else if (month == 3) {
            return 59 + day;
        }
        else if (month == 4) {
            return 90 + day;
        }
        else if (month == 5) {
            return 120 + day;
        }
        else if (month == 6) {
            return 151 + day;
        }
        else if (month == 7) {
            return 181 + day;
        }
        else if (month == 8) {
            return 212 + day;
        }
        else if (month == 9) {
            return 243 + day;
        }
        else if (month == 10) {
            return 273 + day;
        }
        else if (month == 11) {
            return 304 + day;
        }
        else {
            return 334 + day;
        }

    }

    public static String convertDaytoDate(int day) {

        
        if (day >= 0 && day <= 31) {
            return ("January " + Integer.toString(day));
        }
        else if (day >= 32 && day <= 59) {
            return ("February " + (Integer.toString(day - 31)));
        }
        else if (day >= 60 && day <= 90) {
            return ("March " + (Integer.toString(day - 59)));
            
        }
        else if (day >= 91 && day <= 120) {
            return ("April " + (Integer.toString(day - 90)));
        }
        else if (day >= 121 && day <= 151) {
            return ("May " + (Integer.toString(day - 120)));
        }
        else if (day >= 152 && day <= 181) {
            return ("June " + (Integer.toString(day - 151)));
        }
        else if (day >= 182 && day <= 212) {
            return ("July " + (Integer.toString(day - 181)));
            
        }
        else if (day >= 213 && day <= 243) {
            return ("August " + (Integer.toString(day - 212)));
        }
        else if (day >= 244 && day <= 273) {
            return ("September " + (Integer.toString(day - 243)));
        }
        else if (day >= 274 && day <= 304) {
            return ("October " + (Integer.toString(day - 273)));
        }
        else if (day >= 305 && day <= 334) {
            return ("November " + (Integer.toString(day - 304)));
        }
        else {
            return ("December " + (Integer.toString(day - 334)));
        }

    }
}