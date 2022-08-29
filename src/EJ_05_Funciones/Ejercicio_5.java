/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_05_Funciones;

/**
 * 5.Crea una funcion que devuelva un numero aleatorio entre dos numeros enteros
 * que nosotros elijamos
 *
 * @author Junior
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        
       /*for (int i = 1; i <= 5; i++) {
            int aleatorio =  (int) (Math.random() * 10 + 1);
            System.out.println(aleatorio);

        }*/
       
       
       int min=0;
       int max=10;
       
      int aleatorio = numAleatorio(min, max);
        System.out.println(aleatorio);
    } 
    
    public static int numAleatorio (int minimo, int maximo){
    
        return (int) Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    
    }
}
