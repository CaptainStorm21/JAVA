
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class useandcreateobject {
	public static void main (String[] args) {
		int number = 23;
		
		JFrame window = new JFrame();
		window.setTitle("Books");
		window.setSize(500, 500);
		window.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("Title");
		window.add(label);

	}

}
