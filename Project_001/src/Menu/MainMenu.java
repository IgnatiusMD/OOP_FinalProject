package Menu;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JButton buttonPlay = new JButton("Play");
	private JButton buttonCredits = new JButton("Credits");
	private JButton buttonExit = new JButton("Exit");
	
	public MainMenu() {
		mainMenuFrame();
	}

	private void mainMenuFrame() {
		// Creating Windows
		setSize(1020, 1020);
		setTitle("Last Tantasy");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);

		logoSection();
		buttonSection();

		setLocation(500, 5);
		setVisible(true);
	}

	private void logoSection() {
		// Creating Logo Section

		// Read logo
		try {
			BufferedImage logo = ImageIO.read(new File("./src/Assets/Logo.png"));
			JLabel labelLogo = new JLabel(new ImageIcon(logo));
			
			//Add label to logo section
			add(labelLogo, BorderLayout.NORTH);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void buttonSection() {
		/*
		Creating Button section which have Button play, button credit, and button exit
		*/

		JPanel buttonElementContainer = new JPanel();
		buttonElementContainer.setLayout(new GridLayout(3, 1));
		buttonElementContainer.add(buttonPlay);
		buttonElementContainer.add(buttonCredits);
		buttonElementContainer.add(buttonExit);
		
		add(buttonElementContainer, BorderLayout.CENTER);
		
		buttonPlay.addActionListener(this);
		buttonCredits.addActionListener(this);
		buttonExit.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(buttonPlay)) {
			System.out.println("This is Play layout");
		}
		else if(e.getSource().equals(buttonCredits)) {
			System.out.println("this is credit layout");
		}
		else if(e.getSource().equals(buttonExit)) {
			System.exit(0);
		}
	}
	
	
}
