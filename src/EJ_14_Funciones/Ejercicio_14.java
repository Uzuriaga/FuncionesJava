/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_14_Funciones;

/**
 * 15. Crear una función que nos devuelva el mayor y menor número de un array.
 * @author Junior
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        int array[] = {5, 4, 7, 2, 3, 7, 8, 55};
        int mayor_menor[] = mayorMenorArray(array);
        
        //Asegurarse de que el array no esté vacio = NULL
        if (mayor_menor!=null) {
            for (int i = 0; i < mayor_menor.length; i++) {
                System.out.println(mayor_menor[i]);
            }
        }
    }

    public static int[] mayorMenorArray(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        // 0 = mayor, 1 = menor
        int[] mayor_menor = new int[2];

        mayor_menor[0] = array[0];
        mayor_menor[1] = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor_menor[0]) {
                mayor_menor[0] = array[i];
            }
            if (array[i] < mayor_menor[0]) {
                mayor_menor[1] = array[i];

            }
        }
        return mayor_menor;
    }
}
