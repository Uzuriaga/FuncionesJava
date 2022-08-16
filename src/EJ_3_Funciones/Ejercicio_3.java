/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_3_Funciones;

import javax.swing.JOptionPane;

/**
 * 3.Crear una funcion que indique si un numero es mayor que cero
 *
 * @author Junior
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
       
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        JOptionPane.showMessageDialog(null, mayorQue0(num));
        
        /*int num=5;
       
        if (mayorQue0(num)) {
            System.out.println("El numero "+num+" es mayor que cero");
        } else{
            System.out.println("El numero"+num+" es menor que cero");
        }*/
       
        //System.out.println(mayorQue0(num));
    }
    
    public static String mayorQue0 (int num){
        String vrd="Verdadero";
        String fls="Falso";
        if (num>0) {
            return vrd;
        }else{
            return fls;
        }
        //return num>0;
    }
}
