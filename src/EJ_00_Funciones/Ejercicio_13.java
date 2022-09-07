/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ_00_Funciones;

/**
 *
 * @author Junior
 *
 * // 13. Crea una función que valide si un CCC (código cuenta cliente) es
 * correcto. Un CCC es un numero de 20 dígitos que está formado por las
 * siguientes partes: - Entidad: los 4 primeros números - Oficina: los 4
 * siguientes números - Dígitos de control: los 2 siguientes números - Número de
 * cuenta: los últimos 10 dígitos Para que sea válido, debe cumplir lo
 * siguiente: - Tener 20 dígitos - Que todos sean números - Comprobar que los
 * ndígitos de control sean correctos. Lanzar una excepción cuando no se cumpla
 * cualquiera de estas opciones. Te dejo aquí un enlace donde se comenta como se
 * valida. Generador de CCC
 */
public class Ejercicio_13 {

    public static void main(String[] args) {
        
        String CCC = "77452480713791020423";
        try {
            validarCCC(CCC);
            System.out.println("CCC correcto");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public  static void validarCCC(String CCC) throws Exception {

        if (CCC.length() != 20) {
            throw new Exception("La longitud debe ser de 20 digitos");
        }

        String mensajeError = "";
        String aux;

        //
        String ent_of;
        String numeros_cuenta;
        int digito_ent_oficina, digito_num_cuenta;
        String digito_control_resultado;

        for (int i = 0; i < 4; i++) {

            try {
                switch (i) {
                    case 0: //Entidad
                        aux = CCC.substring(0, 4);
                        mensajeError = "Los digitos de la entidad no son números";
                        Integer.parseInt(aux);

                        break;
                    case 1: //Oficina
                        aux = CCC.substring(4, 8);
                        mensajeError = "Los digitos de la Oficina no son números";
                        Integer.parseInt(aux);
                        break;
                    case 2: //Digito de control
                        aux = CCC.substring(8, 10);
                        mensajeError = "Los digitos de control no son números";
                        Integer.parseInt(aux);

                        ent_of = "00" + CCC.substring(0, 8);
                        numeros_cuenta = CCC.substring(10, 20);

                        digito_ent_oficina = obtenerDigitoControl(ent_of);
                        digito_num_cuenta = obtenerDigitoControl(numeros_cuenta);

                        digito_control_resultado = String.valueOf(digito_ent_oficina) + String.valueOf(digito_num_cuenta);

                        if (!digito_control_resultado.equals(aux)) {
                            mensajeError = "Los digitos de control no coinciden";
                            throw new Exception(mensajeError);
                        }

                        break;
                    case 3: //número de cuenta
                        aux = CCC.substring(10, 20);
                        mensajeError = "Los digitos de la cuenta no son números";
                        Integer.parseInt(aux);
                        break;
                }
            } catch (NumberFormatException e) {
                throw new Exception(mensajeError);
            }
        }

    }

    public static int obtenerDigitoControl(String valor_cuenta) {
        int[] factores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        int digito_control = 0;

        int digito_cuenta;
        for (int i = 0; i < valor_cuenta.length(); i++) {
            digito_cuenta = Integer.parseInt(String.valueOf(valor_cuenta.charAt(i)));
            digito_control += digito_cuenta * factores[i];
        }
        digito_control = 11 - (digito_control % 11);
        if (digito_control == 11) {
            digito_control = 0;
        } else if (digito_control == 10) {
            digito_control = 1;
        }
        return digito_control;
    }
}
