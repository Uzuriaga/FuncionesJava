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
        JOptionPane.showMessageDialog(null, esBiciesto(año));
    }

    private static String esBiciesto(int anio) {
        if (anio<=0) {
            return "No es biciesto";
        }
        if (anio % 4 == 0 && (anio % 100 !=0 || anio % 400 == 0)) {
            return  "Es biciesto";
        }
        return null;
        
    }
}
