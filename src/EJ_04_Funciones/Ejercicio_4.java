/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_04_Funciones;

/**
 * 4.Crear una funcion que devuelva el numero ASCII de un caracter pasado por
 * parametro
 *
 * @author Junior
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        
        char caracter='a';
        System.out.println("El caracter \""+caracter+ "\" tiene asociado el codigo " + devCodigoASCCI(caracter));
    }
    
    public static int devCodigoASCCI(char caracter){
    
        return (int)caracter;
    
    }
}
