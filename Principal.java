/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;
public class Principal {
    public static void main(String[] args){
        Triangulo tri1 = new Triangulo();
        
        tri1.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base: ")));
        tri1.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base: ")));
        
        JOptionPane.showMessageDialog(null, "A Area é: " + tri1.getArea());
    }
    
}
