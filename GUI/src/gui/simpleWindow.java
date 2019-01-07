package gui;
import java.awt.*;
import javax.swing.*;

public class simpleWindow {

	public static void main(String[] args) {
		
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
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		button.setEnabled(true);
		
		

	}

}
