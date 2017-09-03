package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GuestBook implements ActionListener {
	JFrame a;
	JPanel pan;
	JButton add;
	JButton view;
	String viewNames;
	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
public static void main(String[] args) {
	GuestBook a = new GuestBook();
			a.activate();
}
public void  activate() {
	names.add("Bob Banders");
	names.add("Sandy Summers");
	names.add("Greg Ganders");
	names.add("Donny Doners");
	a = new JFrame();
	a.setVisible(true);
	pan  = new JPanel();
	add = new JButton();
	view = new JButton();
	a.add(pan);
	pan.add(add);
	pan.add(view);

	add.setText("Add Name");
	view.setText("View Names");
	add.addActionListener(this);
	view.addActionListener(this);
	


	a.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == add) {
		String name = JOptionPane.showInputDialog("Enter a name");
		names.add(name);
	}
	if(e.getSource() ==view ) {
		for(String s : names) {
			if(s != null)
			viewNames = viewNames + s + "\n";
			
		}JOptionPane.showMessageDialog(null, viewNames );
	}
}



}
