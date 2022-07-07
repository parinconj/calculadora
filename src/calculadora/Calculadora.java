package calculadora;

import clase.*;

import javax.swing.JOptionPane;

/**
 *
 * @author G9 Pablo Andres Rincon Jurado 
 */
public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here

        String opcion1;
        String opcion2;
        double numero1,numero2;

        do {
            opcion1 = JOptionPane.showInputDialog("""
                                                              Seleccione una opcion
                                                              
                                                              
                                                              1.  Realizar una operación
                                                              2.  Salir
                                                               """);

            ClsNumeros validacionOpcion1 = new ClsNumeros(opcion1);
            validacionOpcion1.validacion();

            if ("2".equals(opcion1)) {
                break;
            }
            if ("1".equals(opcion1)) {

                do {

                    opcion2 = JOptionPane.showInputDialog("""
                                                              Seleccione una operacion
                                                              
                                                              
                                                              1.  Suma
                                                              2.  Resta
                                                              3.  Multiplicaci\u00f3n
                                                              4.  Divisi\u00f3n
                                                              5.  Potencia
                                                              6.  Raiz cuadrada
                                                              7.  Salir
                                                              """
                    );

                    ClsNumeros validacionOpcion2 = new ClsNumeros(opcion2);
                    validacionOpcion2.validacion();

                    if ("1".equals(opcion2)) {
                        String numero1a = (JOptionPane.showInputDialog("Ingrese número 1 "));
                        ClsNumeros validacion1 = new ClsNumeros(numero1a);
                        numero1 = Double.parseDouble(validacion1.validacion());

                        String numero2a = (JOptionPane.showInputDialog("Ingrese número 2 "));
                        ClsNumeros validacion2 = new ClsNumeros(numero2a);
                        numero2 = Double.parseDouble(validacion2.validacion());

                        ClsOperacion operacion = new ClsOperacion(numero1, numero2);
                        operacion.suma();

                    }

                    if ("2".equals(opcion2)) {
                        String numero1a = (JOptionPane.showInputDialog("Ingrese número 1 "));
                        ClsNumeros validacion1 = new ClsNumeros(numero1a);
                        numero1 = Double.parseDouble(validacion1.validacion());

                        String numero2a = (JOptionPane.showInputDialog("Ingrese número 2 "));
                        ClsNumeros validacion2 = new ClsNumeros(numero2a);
                        numero2 = Double.parseDouble(validacion2.validacion());

                        
                        ClsOperacion operacion = new ClsOperacion(numero1, numero2);
                        operacion.resta();

                    }

                    if ("3".equals(opcion2)) {
                        String numero1a = (JOptionPane.showInputDialog("Ingrese número 1 "));
                        ClsNumeros validacion1 = new ClsNumeros(numero1a);
                        numero1 = Double.parseDouble(validacion1.validacion());

                        String numero2a = (JOptionPane.showInputDialog("Ingrese número 2 "));
                        ClsNumeros validacion2 = new ClsNumeros(numero2a);
                        numero2 = Double.parseDouble(validacion2.validacion());

                        
                        ClsOperacion operacion = new ClsOperacion(numero1, numero2);
                        operacion.multiplicacion();

                    }

                    if ("4".equals(opcion2)) {
                        String numero1a = (JOptionPane.showInputDialog("Ingrese número 1 "));
                        ClsNumeros validacion1 = new ClsNumeros(numero1a);
                        numero1 = Double.parseDouble(validacion1.validacion());

                        String numero2a = (JOptionPane.showInputDialog("Ingrese número 2 "));
                        ClsNumeros validacion2 = new ClsNumeros(numero2a);
                        numero2 = Double.parseDouble(validacion2.validacion());

                        
                        ClsOperacion operacion = new ClsOperacion(numero1, numero2);
                        operacion.division();

                    }

                    if ("5".equals(opcion2)) {
                        String numero1a = (JOptionPane.showInputDialog("Ingrese número 1 "));
                        ClsNumeros validacion1 = new ClsNumeros(numero1a);
                        numero1 = Double.parseDouble(validacion1.validacion());

                        String numero2a = (JOptionPane.showInputDialog("Ingrese número 2 "));
                        ClsNumeros validacion2 = new ClsNumeros(numero2a);
                        numero2 = Double.parseDouble(validacion2.validacion());

                        
                        ClsOperacion operacion = new ClsOperacion(numero1, numero2);
                        operacion.potencia();
                    }

                    if ("6".equals(opcion2)) {
                        String numero1a = (JOptionPane.showInputDialog("Ingrese número:  "));
                        ClsNumeros validacion1 = new ClsNumeros(numero1a);
                        numero1 = Double.parseDouble(validacion1.validacion());
                        
                        ClsOperacion operacion = new ClsOperacion(numero1);
                        operacion.raiz();
                    }

                    if ("7".equals(opcion2)) {
                        JOptionPane.showMessageDialog(null, "Gracias");
                        break;

                    }

                } while (!"7".equals(opcion2));

            }

            if (!"1".equals(opcion1) && !"2".equals(opcion1)) {

                JOptionPane.showMessageDialog(null, "Corrija su selección", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while (!"1".equals(opcion1) && !"2".equals(opcion1));

    }//main 

} //public class calculadora
