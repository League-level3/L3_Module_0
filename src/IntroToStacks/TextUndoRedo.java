package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.charset.Charset;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	JFrame a;
	JPanel b;
	JLabel main;
	Stack<String> back;

	public static void main(String[] args) {
		TextUndoRedo main = new TextUndoRedo();
		main.activate();
		} 
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	void activate() {
		a = new JFrame();
		b = new 	JPanel();
		main = new JLabel();
		a.add(b);
		b.add(main);
		a.setVisible(true);
		a.pack();
		a.addKeyListener(this);
		back = new Stack<String>();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char a =	e.getKeyChar();
			
		if(e.getKeyCode() == KeyEvent.VK_0) {
			System.out.println("should Pop");
			System.out.println(back.pop());
			main.setText(main.getText() + back.pop());
		}
		if(a != KeyEvent.VK_0)	main.setText(main.getText() + a);
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		String s = main.getText();
		System.out.println("should Delete");
		back.push(s.substring(s.length()-2));
		main.setText(s.substring(0, s.length()-2));
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
