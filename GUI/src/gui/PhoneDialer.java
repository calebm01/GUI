package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer implements ActionListener {

	public static void main(String[] args) {
		new PhoneDialer();

	}
	public PhoneDialer() {
		JButton button1 = new JButton("0");
		JButton button2 = new JButton("1");
		JButton button3 = new JButton("2");
		JButton button4 = new JButton("3");
		JButton button5 = new JButton("4");
		JButton button6 = new JButton("5");
		JButton button7 = new JButton("6");
		JButton button8 = new JButton("7");
		JButton button9 = new JButton("8");
		JButton button10 = new JButton("9");
		JButton button11 = new JButton("-");
		JButton button12 = new JButton("0");
		JButton button13 = new JButton("Dial Number");
		
		String number = "";
		
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Dialer");
		myFrame.setSize(200,250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout myLayout = new FlowLayout();
		myFrame.setLayout(myLayout);
		
		myFrame.add(button1);
		myFrame.add(button2);
		myFrame.add(button3);
		myFrame.add(button4);
		myFrame.add(button5);
		myFrame.add(button6);
		myFrame.add(button7);
		myFrame.add(button8);
		myFrame.add(button9);
		myFrame.add(button10);
		myFrame.add(button11);
		myFrame.add(button12);
		myFrame.add(button13);
		
		myFrame.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent event) {
		
	}

}
