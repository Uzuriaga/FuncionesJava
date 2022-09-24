/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_16_Funciones;

/**
 * 16. Crear una funcion que nos devuelva en un array todos los posibles
 * divisores de un número
 *
 * @author Junior
 */
public class Ejercicio_16 {

    public static void main(String[] args) {
        int numero = 100;

        int[] divisores = divisores(numero);

        if (divisores!= null) {
            for (int i = 0; i < divisores.length; i++) {
                System.out.println(divisores[i]);
            }
        }
    }

    public static int[] divisores(int numero) {
        int contador = 0;

        for (int i = numero; i > 1; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 0) {
            return null;
        } else {

            int[] divisores = new int[contador];

            for (int i = numero,j=0; i > 1; i--) {
                if (numero % i == 0) {
                    divisores[j]=i;
                    j++;
                }
            }
            return divisores;
        }
    }

}
