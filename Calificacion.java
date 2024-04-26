
package com.mycompany.dogs;

import java.util.Scanner;

/*****************************************************************************
 * Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un *
 * alumno sea mayor igual a 70, en caso contrario mostrar el mensaje         *
 * "Reprobado                                                                *   
 *****************************************************************************/

public class Calificacion {
    public static void main(String[] args) {
        
       int calificacion;
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Señor usuario ingrese la nota");
       calificacion = input.nextInt();
       
       if(calificacion>=70){
           System.out.println("Aprobado");
       }
       else {
           System.out.println("Reprobado");
       }
 
        
    }
    
}
