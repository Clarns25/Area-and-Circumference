/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaandcircumference_yap;

/**
 *
 * @author Me
 */
import javax.swing.JOptionPane;
public class AreaandCircumference_Yap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double radius; // TODO code application logic here
       double area;
       double circumference;
       
       String radiusString;
       String outputStr;
       
       radiusString = JOptionPane.showInputDialog("Enter the radius: ");
       radius = Double.parseDouble(radiusString);
       area = Math.PI * radius;
       circumference = 2*Math.PI * radius;
       outputStr = "Radius:" + radius + "\n" + "Area: " + area + "square units\n" + "Circumference: " + circumference + "units";
       JOptionPane.showMessageDialog(null, outputStr, "Circle", JOptionPane.INFORMATION_MESSAGE);
       
       System.exit(0);
    }
    
}
