package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame fram = new JFrame();
	JPanel pan = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	JButton search = new JButton();
	HashMap<Integer, String> values;
	String list;
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	public static void main(String[] args) {
		LogSearch a = new LogSearch();
		a.activate();

	}

	void activate() {
		values = new HashMap<Integer, String>();
		fram.add(pan);
		pan.add(add);
		pan.add(search);
		pan.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		search.addActionListener(this);
		fram.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String id = JOptionPane.showInputDialog("Enter an ID");
			String entry = JOptionPane.showInputDialog("Enter a name");
			values.put(Integer.parseInt(id), entry);
		}
		if (e.getSource() == search) {
			String ifin = JOptionPane.showInputDialog("What is your Id");
			if (values.containsKey(Integer.parseInt(ifin))) {
				JOptionPane.showMessageDialog(null, values.get(Integer.parseInt(ifin)));

			} else {
				JOptionPane.showMessageDialog(null, "The value is not in the system");
			}
		}
		if (e.getSource() == view) {
			list = "";
			for(int x: values.keySet()) {
				  list= 	"ID: " + x + "Name: " + values.get(x)                     																											;  
				
			}
			JOptionPane.showMessageDialog(null, list);

		}
	}

}
