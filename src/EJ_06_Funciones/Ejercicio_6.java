/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_06_Funciones;

import javax.swing.JOptionPane;

/**
 * 6.Crear una funcion que nos devuelva el factorial de un numero entero
 *
 * @author Junior
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el entero"));
        JOptionPane.showMessageDialog(null, "El factorial es: " + factorial(num));
    }

    public static int factorial(int num) {

        if (num < 0) {
            JOptionPane.showMessageDialog(null, "No se puede calcular el factorial de un numero ");
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }

        int resultado = num;

        for (int i = (num - 1); i > 1; i--) {
            resultado *= i;
        }

        return resultado;
    }
}
