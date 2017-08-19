
package javaapplication78;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class JavaApplication78 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd '.' MMMM yyyy", Locale.forLanguageTag("sr"));
        SimpleDateFormat parser = new SimpleDateFormat("ddMMyyyy");
        
        
        
     String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
     
      List Podaci = Person.parsePoints(text);
        for(Object p:Podaci){
        Person per = (Person)p;
        System.out.println("Ime: "+per.ime+" Prezime: " + per.prezime + " Datum rodjenja: "+formater.format(parser.parse(per.datumRodjenja))+" Mjesto rodjenja: "+per.mjestoRodjenja);
        }
     
     
     
     
     	
    }
    
}
