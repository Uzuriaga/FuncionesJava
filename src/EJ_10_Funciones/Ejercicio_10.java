/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_10_Funciones;

/**
 *
 * @author Junior
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7};
        mostrar(numeros);
    }
    private static void mostrar(int[] array){
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
