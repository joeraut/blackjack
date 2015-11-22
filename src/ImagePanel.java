import java.awt.*;

import javax.swing.*;

// A class which when given a file name, returns a JPanel with the image stretched to fit its boundaries.

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(String imgStr) { // Constructor, passed image string
		this.img = new ImageIcon(imgStr).getImage();
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null)); // If we don't use setBounds (after instance is created), this is a fallback to the actual dimensions of the image
		setSize(size);
		setLayout(null);
	}

	public void paintComponent(Graphics g) { // Draw the image to the JPanel
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}
}