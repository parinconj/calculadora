/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author parin
 */
public class ClsNumeros {

    public String numero;

    public ClsNumeros(String numero) {
    this.numero = numero;
    }



    public static boolean isNumber(String in) {

        try {
            Integer.parseInt(in);
            return true;
        } catch (NumberFormatException E) {
            return false;
        }

    }

    public String validacion() {

        if (isNumber(this.numero)) {

            return numero;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese número valido");
        }
        return null;

       
    }

}
