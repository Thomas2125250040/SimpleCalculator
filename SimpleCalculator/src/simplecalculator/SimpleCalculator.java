/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.awt.Font;

/**
 *
 * @author Programming
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    JFrame frame;
    JTextField textField;
	JButton[] nmbrBtn = new JButton[10];
	JButton[] functionBtn = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, clrButton;
	JPanel panel;
	
	Font myFont = new Font("Ink Free", Font.BOLD, 30);
	
	double num1=0, num2=0, result=0;
	char operator;
	
	SimpleCalculator(){
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		frame.setVisible(true);;
	}
	
    public static void main(String[] args) {
        // TODO code application logic here
    	new SimpleCalculator();
    	
        
    }
    
}
