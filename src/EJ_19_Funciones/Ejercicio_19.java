/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_19_Funciones;

import java.util.Date;

/**
 *
 * @author Junior
 */
public class Ejercicio_19 {

    public static void main(String[] args) {
        System.out.println(numDias(1));
        System.out.println(numDias(2));
        System.out.println(numDias(19));
        System.out.println(numDias(12));
        
    }

    private static int numDias(int mes) {
        int numDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28;
                
                int añoActual = new Date().getYear()+1900;
                if (esBisiesto(añoActual)) {
                    numDias++;
                }
                break;
            default:
                numDias = -1;
        }
        return numDias;
    }
    
    
    private static boolean esBisiesto(int año) {
        if (año<=0) {
            return false;
        }
        if (año % 4 == 0 && (año % 100 !=0 || año % 400 == 0)) {
            return true;
        }
        return false;
        
        
    }
}
