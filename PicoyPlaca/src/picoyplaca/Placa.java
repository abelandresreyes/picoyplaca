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

//class Placa, usada para manejar el numero de placa que ingrese el usuario
// para consultar si se debe regir al pico y placa o no.
public class Placa {
    public String placa;
    
    public Placa (String p){
    this.placa=p;
    }
    
    // metodo getUltimoDigito permite obtener el ultimo digito de la placa del usuario
    // y con eso poder ocnsultar si se rige o no al Pico y Placa en algun determinado dia.
    public int getUltimoDigito(Placa pla){
        String codigo=pla.placa;
    char a=codigo.charAt(codigo.length()-1);
    return Character.getNumericValue(a);
    }
}
