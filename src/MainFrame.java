import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	
	//The main window, displays the background image (note the dynamic boundaries are so the image stretches nicely for a given window size)

	MainFrame() {
		setTitle("Blackjack");
		setSize(900, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		
		ImagePanel bgImagePanel = new ImagePanel("background.png");
		bgImagePanel.setBounds(0, 0, this.getWidth(), this.getHeight());
		setContentPane(bgImagePanel);
	}

}
