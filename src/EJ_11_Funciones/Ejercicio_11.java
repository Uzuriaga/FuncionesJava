/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_11_Funciones;

import EJ_10_Funciones.*;

/**
 *
 * @author Junior
 */
public class Ejercicio_11 {
    
    /*11. Crear una función que nos devuelva la suma de un array otra que nos devuelva la media*/

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        
        System.out.println("La suma es "+ suma(numeros));
        
        System.out.println("La media es "+ media(numeros));

    }

    private static int suma(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }
    
    private static double media(int[]numeros){
    int suma = suma (numeros);
    
    return suma / numeros.length;
    }
}
