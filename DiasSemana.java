
package com.mycompany.dogs;

import javax.swing.JOptionPane;

/*Ejercicio Dias de semana */
public class DiasSemana {
    
    public static void main(String[] args) {
        
        String nombredia;
        int days;
        days = Integer.parseInt(JOptionPane.showInputDialog("Señor usuario ingrese el numero del dia "));
       
        
        switch (days){
            case 1: 
                nombredia = "lunes";        
                break;
            case 2: 
                nombredia = "martes";
                break;
            case 3: 
                nombredia = "miercoles";
                break;
            case 4: 
                nombredia = "jueves";
                break;
            case 5: 
                nombredia = "viernes";
                break;
            case 6: 
                nombredia = "sabado";
                break;
            case 7: 
                nombredia = "domingo";
                break;
            default: nombredia = "Numero de dia incorrecto";
            
                  JOptionPane.showMessageDialog(null, "Señor usuario el numero de dia que ingresaste es un " + nombredia);

             
        }
        
        

        
        
    }
    
    
    
    
    
    
}
