package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class simpleWindow2 implements ActionListener{

	public static void main(String[] args) {
		
		new simpleWindow2();

	}

	public simpleWindow2() {
		super();
		JFrame frame = new JFrame();
		FlowLayout layout = new FlowLayout();
		
		frame.setLayout(layout);
		frame.setTitle("simple window");
		frame.setSize(400,200);
		frame.setLocation(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel label = new JLabel("This is my label!");
		frame.add(label);
		
		JButton button = new JButton();
		button.addActionListener(this);
		frame.add(button);
		
		
	}
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, "Hey that tickles");
		}
	}
	
	


