/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_09_Funciones;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        do {
            System.out.println("Escribe un numero positivo");
            num= sc.nextInt();
        } while (num<0);
        
        
        int cifras= cuentaCifras(num);
        
        System.out.println("Hay "+cifras+" cifra/s");
    }

    private static int cuentaCifras(int num) {
        int cifras=1;
        for (int i = num; i >= 10; i/=10) {
            cifras++;
            
        }
        return cifras;
    }
}
