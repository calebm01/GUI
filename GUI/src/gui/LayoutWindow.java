package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class LayoutWindow {
	JFrame myFrame;
	JPanel contentPane;
	FlowLayout fLayout;
	GridLayout gLayout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel myPanel;

	public static void main(String[] args) {
		//creates an instance of the layout window
		new LayoutWindow();
	
		

	}
	
	public LayoutWindow() {
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myPanel = (JPanel)myFrame.getContentPane();
		myFrame.setSize(200,200);
		myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
		
		//child JPanel for the top area
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
		
		//label that will go in the top child JPanel
		JLabel myLabel = new JLabel("What is your favorite fruit?");
		topPanel.add(myLabel);
		
		//child JPanel for the bottom area
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,2,2,2));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		//buttons that will go in the bottom child JPanel
		bottomPanel.add(new JButton("Apple"));
		bottomPanel.add(new JButton("Apple"));
		bottomPanel.add(new JButton("Apple"));
		bottomPanel.add(new JButton("Apple"));
		myPanel.add(topPanel);
		myPanel.add(bottomPanel);
		
		
		myFrame.setVisible(true);
	}

}
