/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_18_Funciones;

import javax.swing.JOptionPane;

/**
 * 18. Decir si un año es bisiesto o no
 *
 * @author Junior
 */
public class Ejercicio_18 {
    
    public static void main(String[] args) {
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un año"));
        JOptionPane.showMessageDialog(null, esBisiesto(año));
    }

    private static String esBisiesto(int año) {
        if (año<=0) {
            return "Inserte un año valido";
        }
        if (año % 4 == 0 && (año % 100 !=0 || año % 400 == 0)) {
            return  "Es bisiesto";
        }
        return "No es biciesto";
        
    }
}
