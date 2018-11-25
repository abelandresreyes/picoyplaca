/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author: Abel Reyes
 * @date: 11/25/2018
 */

//class Tiempo, usada para manejar la hora que ingrese el usuario
// para consultar si se debe regir al pico y placa o no
public class Tiempo {
    public String lahora; 
    
    
    public Tiempo(String t){
    this.lahora=t;
    }
    
    // metodo verificarTiempo es el encargado de recibir un objeto tipo Tiempo
    // y verificar si este esta dentro de los horarios de restriccion vehicular en el Pico y Placa
    public boolean verificarTiempo (Tiempo t){
    boolean value;
    boolean a,b;
    a=false; b=false;
    try {    
    String string1 = "07:00:00";
    Date time1 = new SimpleDateFormat("HH:mm:ss").parse(string1);
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTime(time1);

    String string2 = "09:30:00";
    Date time2 = new SimpleDateFormat("HH:mm:ss").parse(string2);
    Calendar calendar2 = Calendar.getInstance();
    calendar2.setTime(time2);
    calendar2.add(Calendar.DATE, 1);
    
    String string3 = "16:00:00";
    Date time3 = new SimpleDateFormat("HH:mm:ss").parse(string3);
    Calendar calendar3 = Calendar.getInstance();
    calendar3.setTime(time3);
    calendar3.add(Calendar.DATE, 1);

    String string4 = "19:30:00";
    Date time4 = new SimpleDateFormat("HH:mm:ss").parse(string4);
    Calendar calendar4 = Calendar.getInstance();
    calendar4.setTime(time4);
    calendar4.add(Calendar.DATE, 1);
     
    
    String tUser = t.lahora;
    Date d = new SimpleDateFormat("HH:mm:ss").parse(tUser);
    Calendar calendar5 = Calendar.getInstance();
    calendar5.setTime(d);
    calendar5.add(Calendar.DATE, 1);
    
    
    Date x = calendar5.getTime();
    if ((x.after(calendar1.getTime())) && (x.before(calendar2.getTime()))) {
       a=true;
       //System.out.println("a1");
    }
    if ((x.after(calendar3.getTime())) && (x.before(calendar4.getTime()))) {
       b=true;
      // System.out.println("b1");
    }
    }
  catch (ParseException e) {
    e.printStackTrace();
}
    value= a || b;
    return value;
    }
    
    
    
}
