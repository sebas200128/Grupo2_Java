/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PC1;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Rabanal
 */
public class Ejer5 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero N: "));

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "No hay numeros impares");
               
        }else{
            int mayorImpar = (n % 2 == 0) ? n - 1 : n;
            JOptionPane.showMessageDialog(null, "El numero impar es mas grande entre 1 y "+n+" es: "+mayorImpar);
        }
    }
}
