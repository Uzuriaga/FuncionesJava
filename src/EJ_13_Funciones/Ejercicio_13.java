/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_13_Funciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
*14. Vamos a validar un DNI.
El formato es:
• 7 u 8 dígitos numéricos
• Una letra entre las siguientes 
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E

La letra se genera según el número del DNI. Para calcular la letra, cogeremos el resto de dividir nuestro DNI entre 23, el resultado debe estar entre 0 y 22, donde será la posición de la letra (piensa en un array de char).
No utilices expresiones regulares para este ejercicio.
Todos los errores deben ser capturados por excepciones mediante tu propia clase (heredada de exception
 * @author Junior
 */
public class Ejercicio_13 {

    public static void main(String[] args) throws Exception {
        try {
            validarDNI("70588387F");
            System.out.println("El DNI es correcto");
        } catch (DNIException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    private static void validarDNI(String DNI) throws Exception {
        
        if (!(DNI.length()>=8 && DNI.length()<=9)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
        
        String parte_numerica = DNI.substring(0, DNI.length()-1);
        
        int numeroDNI=0;
        
        try {
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }
        
        char letra = DNI.substring(DNI.length()-1, DNI.length()).toUpperCase().charAt(0);
        
        if (!(letra>='A' && letra<='Z')) {
            throw new DNIException(DNIException.PARTE_LETRA_NO_CORRECTA);
        }
        
        //Validar el formato
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'O', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        int resto = numeroDNI % 23;
        
        String nuevoDNI = numeroDNI + "" +letrasNIF[resto];
        
        if (DNI.startsWith("0")) {
            nuevoDNI = "0"+nuevoDNI;
        }
        
        if (!(nuevoDNI.equals(DNI))) {
            throw new DNIException(DNIException.FORMATO_NO_VALIDO);
        }
    }
}
