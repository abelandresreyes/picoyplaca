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

import java.util.*;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class PicoyPlaca {

    /**
     * @param args the command line arguments
     */
    
    //main method del proyecto pico y placa.
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        Scanner scan = new Scanner(System.in);
        //boolean verificar;
        // Fecha test=new Fecha(24,11,2018);
        //Placa p= new Placa("GLS0902");
        //Tiempo t=new Tiempo ("20:00:00");
        //boolean verificar2;
        
        do{
        System.out.println("Bienvenido al predictor de pico y placa"); 
        String s1; 
	Scanner sc1 = new Scanner(System.in);
 	System.out.println("Ingrese la placa: Ex: GSTXXXX"); 
 	s1 = sc1.nextLine();  
        Placa p= new Placa(s1);
        
        String s2; 
	Scanner sc2 = new Scanner(System.in);
 	System.out.println("Ingrese la fecha en el siguiente formato: dd/MM/yyyy"); 
 	s2 = sc2.nextLine();  
        Fecha test2=new Fecha(s2);
        
        String s3; 
	Scanner sc3 = new Scanner(System.in);
 	System.out.println("Ingrese la Hora en el siguiente formato: HH:MM:SS"); 
 	s3 = sc3.nextLine();  
        Tiempo t2=new Tiempo(s3);
        predecirPicoyPlaca(p,test2,t2); 
        
        System.out.println("Cualquier numero para continuar, -1 para salir"); 
         number = scan.nextInt();
        }while(number!=-1);
       // test2.printFecha();
       // System.out.println("Esto es prueba" + test.diaSemana(test2));
        
        //System.out.println("\nEsto es prueba " + p.getUltimoDigito(p));
        
//       verificar2=t2.verificarTiempo(t2);
//       if (verificar2==true){
//        System.out.println("En medio");
//        }
//        else
//        System.out.println("No En medio");
        }
    // metodo predecirPicoyPlaca, predice si el auto se debe regir al pico y placa segun los datos
    // proporcionados por el usuario, tales como Placa, fecha y hora.
    public static void predecirPicoyPlaca(Placa p, Fecha f, Tiempo t){
        //boolean valor=false;
        String dia=f.diaSemana(f);
        int uD=p.getUltimoDigito(p);
        boolean hora= t.verificarTiempo(t);
        
        if ((dia=="L") && (uD==1 || uD==2) && (hora)){
        System.out.println("El auto no puede circular, Lunes restringidos para placas terminadas en 1 y 2\n"
                + "desde las 7:00 hasta las 9:30 y desde las 16:00 hasta las 19:30");
        }
        else if ((dia=="M") && (uD==3 || uD==4) && (hora)){
        System.out.println("El auto no puede circular, Martes restringidos para placas terminadas en 3 y 4\n"
                + "desde las 7:00 hasta las 9:30 y desde las 16:00 hasta las 19:30");
        }
        else if ((dia=="X") && (uD==5 || uD==6) && (hora)){
        System.out.println("El auto no puede circular, Miercoles restringidos para placas terminadas en 5 y 6\n"
                + "desde las 7:00 hasta las 9:30 y desde las 16:00 hasta las 19:30");    
        }
        else if ((dia=="J") && (uD==7 || uD==8) && (hora)){
        System.out.println("El auto no puede circular, Jueves restringidos para placas terminadas en 7 y 8\n"
                + "desde las 7:00 hasta las 9:30 y desde las 16:00 hasta las 19:30");
        }
        else if ((dia=="V") && (uD==9 || uD==0) && (hora)){
          System.out.println("El auto no puede circular, Viernes restringidos para placas terminadas en 9 y 0\n"
                + "desde las 7:00 hasta las 9:30 y desde las 16:00 hasta las 19:30");        }
        else {
        System.out.println("El auto puede circular");
        //valor=true;
        }
        //return valor;
        }
    }
    

