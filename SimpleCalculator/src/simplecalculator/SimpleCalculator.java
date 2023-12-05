/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Programming
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {

	/**
	 * @param args the command line arguments
	 */
	JFrame frame;
	JTextField textField;
	JButton[] numBtns = new JButton[10];
	JButton[] functionBtns = new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, clrButton, delButton, negButton;
	JPanel panel;

	Font myFont = new Font("Ink Free", Font.BOLD, 30);

	double num1 = 0, num2 = 0, result = 0;
	char operator;

	SimpleCalculator() {
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);

		textField = new JTextField();
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(false);

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		negButton = new JButton("(-)");

		functionBtns[0] = addButton;
		functionBtns[1] = subButton;
		functionBtns[2] = mulButton;
		functionBtns[3] = divButton;
		functionBtns[4] = decButton;
		functionBtns[5] = equButton;
		functionBtns[6] = delButton;
		functionBtns[7] = clrButton;
		functionBtns[8] = negButton;
		
		for(int i =0;i<9;i++) {
			functionBtns[i].addActionListener(this);
			functionBtns[i].setFont(myFont);
			functionBtns[i].setFocusable(false);
			
		}
		
		for(int i=0;i<10;i++) {
			numBtns[i] = new JButton(String.valueOf(i));
			numBtns[i].addActionListener(this);
			numBtns[i].setFont(myFont);
			numBtns[i].setFocusable(false);
			
		}
		
		negButton.setBounds(50, 430, 100, 50);
		delButton.setBounds(150, 430, 100, 50);
		clrButton.setBounds(250, 430, 100, 50);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
		
		panel.add(numBtns[1]);
		panel.add(numBtns[2]);
		panel.add(numBtns[3]);
		panel.add(addButton);
		panel.add(numBtns[4]);
		panel.add(numBtns[5]);
		panel.add(numBtns[6]);
		panel.add(subButton);
		panel.add(numBtns[7]);
		panel.add(numBtns[8]);
		panel.add(numBtns[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numBtns[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(negButton);
		frame.add(textField);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO code application logic here
		new SimpleCalculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource() == numBtns[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == decButton) {
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		if(e.getSource() == equButton) {
			num2 = Double.parseDouble(textField.getText());
			switch(operator) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource() == clrButton) {
			textField.setText("");
		}
		if(e.getSource() == delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
		if(e.getSource() == negButton) {
			double temp = Double.parseDouble(textField.getText());
			temp *= -1;
			textField.setText(String.valueOf(temp));
		}
	}

}
