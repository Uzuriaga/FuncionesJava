/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_2_Funciones;

import javax.swing.JOptionPane;

/**
 * 2.Crea una función que devuelva la suma de 2 numeros,pasados por parametros
 *
 * @author Junior
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        
        //Forma un poco básica
        /*int a=5;
        int b=22;
        
        int resultado = suma(a, b);
        System.out.println("resultado = " + resultado);*/
        
        //Con elegancia
        
        int a,b;
        a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        b= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        JOptionPane.showMessageDialog(null,"El resultado es: "+ suma(a, b));

    }
    public static int suma(int a, int b){
        
        return a+b;
    }
}
