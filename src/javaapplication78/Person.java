
package javaapplication78;

import java.util.ArrayList;
import java.util.List;



public class Person {
    public String ime;
    public String prezime;
    public String datumRodjenja;
    public String mjestoRodjenja;
    
    
    public static List parsePoints(String text){
    List res = new ArrayList();
    text = text.replace(".","/");
    String []textArr = text.split(" ");
                
    for(String tekst : textArr){
    res.add(Person.parse(tekst));
                
                }
    
    return res;
    
    }
    
    
    
    
    
    
    public static Person parse(String tekst){
    Person res = new Person();
       String[] tekstArr= tekst.split("/");
        res.ime = tekstArr[0];
        res.prezime = tekstArr[1];
        res.datumRodjenja = tekstArr[2];
        res.mjestoRodjenja = tekstArr[3];
        return res;
    
    
   
    
    
    
    
    
    }
               
     }

