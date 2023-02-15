package window;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import observer.Observer;


public class UI1 extends Observer  {

	//Creation de la fenetre
	JFrame frame = new JFrame("UI1");
	JPanel panel = new JPanel();
	
	public UI1(MainWindow1 mainWindowSubject) {
		this.subject = mainWindowSubject; 
		this.subject.attach(this);
		
		frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setBackground(Color.BLUE);
        frame.setVisible(true);   
	}

	@Override
	public void update() {
		panel.setBackground(subject.getCustomState());
	}

}
