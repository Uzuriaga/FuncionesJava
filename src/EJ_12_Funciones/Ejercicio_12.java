/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_12_Funciones;

/**
 *
 * @author Junior
 */

/*12.Crear una función que nos devuelva un array de un numero a otro, ambos incluidos.
por ejemplo si se introduce el 5 a 7, el array deberia tener los numeros 5,6,7 pero si inserto
el 7 a 5 el array tendra los numeros 7,6,5*/
public class Ejercicio_12 {

    public static void main(String[] args) {
        int[] arr1 = serie(5, 7);
        int[] arr2 = serie(7, 5);
        int[] arr3 = serie(5, 5);

        System.out.println('\n'+"Inicio 5 y final 7"+'\n');
        mostrar(arr1);
        System.out.println('\n'+"Inicio 7 y final 5"+'\n');
        mostrar(arr2);
        System.out.println('\n'+"Inicio 5 y final 5"+'\n');
        mostrar(arr3);
    }

    private static int[] serie(int inicio_num, int final_num) {

        int tamaño = Math.abs(inicio_num - final_num) + 1;
        int[] serie = new int[tamaño];
        
        if (inicio_num < final_num) {
            for (int i = 0, j=inicio_num; i < serie.length; i++,j++) {
                serie[i]= j;
            }
    
        }else{
            for (int i = 0, j=inicio_num; i < serie.length; i++,j--) {
                serie[i]=j;
            }
        
        }
   
  
        return serie;
    }

    private static void mostrar(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
