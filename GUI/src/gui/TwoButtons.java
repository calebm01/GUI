package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoButtons implements ActionListener{
	JButton redButton = null;
	JButton greenButton = null;
	JFrame myFrame = new JFrame();

	public static void main(String[] args) {
	
		new TwoButtons();

	}

	public TwoButtons() {
		super();
	
	
		
		myFrame.setTitle("choose your color");
		myFrame.setSize(550,150);
		myFrame.setLocation(200, 300);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FlowLayout myLayout = new FlowLayout();
		BorderLayout myLayout = new BorderLayout();
		myFrame.setLayout(myLayout);
		
	    redButton = new JButton("Red");
	    greenButton = new JButton("Green");
		
		myFrame.add(redButton, BorderLayout.LINE_START);
		myFrame.add(greenButton, BorderLayout.LINE_END);
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		myFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
				
		if (control == redButton) {
			myFrame.getContentPane().setBackground(Color.red);
		}
		else if (control == greenButton) {
			myFrame.getContentPane().setBackground(Color.green);
		}
	}

}
