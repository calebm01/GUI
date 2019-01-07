package gui;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

/*
 * Caleb Mouritsen
 * 1/3/19
 * quiz card builder
 * 
 * this class will allow the user to create a set of quiz cards and use
 * them for future use with the quiz card player class
 */

public class QuizCardBuilder {
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;

	public static void main(String[] args) {
		QuizCardBuilder builder = new QuizCardBuilder();
		builder.go();
		
		

	}
	public void go() {
		/*
		 * build GUI
		 * this is all GUI code nothing too special although 
		 * you might want to look at the menu bar section
		 */
		frame = new JFrame("Quiz Card Builder");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD,24);
		
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		
		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);
		
		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextButton = new JButton("Next Card");
		
		cardList = new ArrayList<QuizCard>();
		
		JLabel qLabel = new JLabel("Question:");
		JLabel aLabel = new JLabel("Answer:");
		
		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());
		
		/*
		 *  we make a menu bar and make a file menu, then put new
		 *  and save items in to the file menu. We then add the file menu to 
		 *  the menu bar then tell the frame to use this menu bar
		 */
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		newMenuItem.addActionListener(new newMenuListener());
		newMenuItem.addActionListener(new SaveMenuListener());
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		
		
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
	}//end of go
	
	public class NextCardListener implements ActionListener{

		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardList.add(card);
			clearCard();
			
		}
		
	}//end cardlistener
	
	public class newMenuListener implements ActionListener{

		public void actionPerformed(ActionEvent ev) {
			cardList.clear();
			clearCard();
			
		}
		
	}
	
	public class SaveMenuListener implements ActionListener{

		
		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(),answer.getText());
			cardList.add(card);
			/*
			 * this code brings up a file dialog box and waits on this line
			 * until the user chooses to save from the dialog box.  All the file
			 * dialog navigation and selecting a file etc. is done for us 
			 * by the JFileChooser class
			 */
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			SaveFile(fileSave.getSelectedFile());
			
			
		}
		
	}
	
	private void clearCard() {
		question.setText("");;
		answer.setText("");
		question.requestFocus();
		
	}
	/*
	 * this method does the actual file writing. It is called by the save 
	 * menu listener event handler. The argument is the file object the
	 * user is saving
	 */
	private void SaveFile(File file) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));	
			for (QuizCard card:cardList) {
				writer.write(card.getQuestion()+"/");
				writer.write(card.getAnswer()+"\n");
			}
			writer.close();
			
		}catch (IOException ex) {
			System.out.println("couldn't write the cardList out");
			ex.printStackTrace();
	}
	

}
}
