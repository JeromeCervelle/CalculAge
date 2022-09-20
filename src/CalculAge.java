import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;

public class CalculAge {

    public static boolean check(String date)
    {
        // Définir le format date préféré
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try
        {
            Date d = format.parse(date);
            System.out.println(date+" est une date valide");
        }
        // Date invalide
        catch (ParseException e)
        {
            System.out.println(date+" est une date invalide");
            return false;
        }
        // Renvoie true si la date est valide
        return true;
    }

    public static void main(String args[]) {

        check("25/07/2020");
        check("25/07/0000");
        check("25,07,2020");

        //Autre exemple
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime().toString());

        cal.set(1996, 1, 942);
        System.out.println(cal.getTime().toString());

        cal.setLenient(false);
        try {
            // try it again
            cal.set(1996, 1, 942);
            System.out.println(cal.getTime().toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
