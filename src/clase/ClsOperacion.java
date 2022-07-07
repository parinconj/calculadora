package clase;

import java.lang.Math;
import javax.swing.JOptionPane;

/**
 *
 * @author parin
 */
public class ClsOperacion {

    double numero1, numero2, resultado;

    public ClsOperacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public ClsOperacion(double numero1) {
        this.numero1 = numero1;
    }

    public void suma() {

        resultado = this.numero1 + this.numero2;
        String resultadoFin = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoFin);

    }

    public void resta() {

        resultado = this.numero1 - this.numero2;
        String resultadoFin = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoFin);

    }

    public void multiplicacion() {

        resultado = this.numero1 * this.numero2;
        String resultadoFin = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoFin);

    }

    public void division() {

        resultado = this.numero1 / this.numero2;
        String resultadoFin = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoFin);

    }

    public void potencia() {

        resultado = Math.pow(this.numero1, this.numero2);
        String resultadoFin = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoFin);

    }

    public void raiz() {

        resultado = Math.sqrt(this.numero1);
        String resultadoFin = String.format("%.2f", resultado);

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoFin);

    }

}
