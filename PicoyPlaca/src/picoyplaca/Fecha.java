/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoyplaca;

/**
 *
 * @author: Abel Reyes
 * @date: 11/25/2018
 */


import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Object;
//class Fecha, usada para manejar la fecha que ingresa el usuario
// para consultar si se debe regir al pico y placa o no.
public class Fecha {
    public int dia, mes, anio;
    //Constructor de Fecha que recibe dia, mes y a~o como integers y separados
    public Fecha(int d, int m, int a){
    this.dia=d;
    this.anio=a;
    this.mes=m;
    }
    //Constructor de Fecha que recibe dia, mes y a~o como String conjuntamente en el siguiente formato:
    // dd/MM/aaaa.
    public Fecha(String f){
        String d,a,m;
        d=f.substring(0,2);
        m=f.substring(3,5);
        a=f.substring(6,10);
        this.dia=Integer.parseInt(d);
        this.mes=Integer.parseInt(m);
        this.anio=Integer.parseInt(a);   
    }
    
    //metodo que me permite imprimir la fecha y verificar que puedo separar dia, mes y a~o para poder manipularlos
    public void printFecha(){
    System.out.println("dia:"+ dia + " Mes:"+this.mes+" A~o:"+ this.anio);
    }
    // metodo diaSemana, retorna la inicial del dia correspondiente a la fecha ingresada previamente por el usuario.
    public String diaSemana (Fecha f){
        int d=f.dia; int m=f.mes; int a=f.anio;
    String letraD="";
        /*Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia, 0, 0, 0);
        nD=c.get(Calendar.DAY_OF_WEEK);*/
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(a, m-1, d);
        int nD=calendar.get(Calendar.DAY_OF_WEEK);
  //      Log.i("result","diaSemana: "+nD+" dia:"+d+" mes:"+m+ "año:" +a);
        switch (nD){
            case 1: letraD = "D";
                break;
            case 2: letraD = "L";
                break;
            case 3: letraD = "M";
                break;
            case 4: letraD = "X";
                break;
            case 5: letraD = "J";
                break;
            case 6: letraD = "V";
                break;
            case 7: letraD = "S";
                break;
        }

        return letraD;
    
    } 
}
