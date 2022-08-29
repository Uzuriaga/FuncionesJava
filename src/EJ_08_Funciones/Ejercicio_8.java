/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_08_Funciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Inserta una frase", "Insercción", JOptionPane.INFORMATION_MESSAGE);

        int vocales = conteoVocales(texto.toLowerCase());
        System.out.println("Hay " + vocales + " vocal/es");
    }

    private static int conteoVocales(String frase) {
        int contador = 0;
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};

        char caracterActual;
        boolean esVocal;

        for (int i = 0; i < frase.length(); i++) {

            caracterActual = frase.charAt(i);

            esVocal = false;

            for (int j = 0; j < vocales.length && !esVocal; j++) {
                
                if (caracterActual == vocales[j]) {
                    
                    esVocal = true;
                }
            }
            if (esVocal) {
                contador++;
            }
        }
        return contador;
       
    }
}
