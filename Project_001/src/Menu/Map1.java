package Menu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.*;

public class Map1 {
	
	
	public CardLayout cardLayout = new CardLayout();
	public JPanel panel = new JPanel(cardLayout);
	
	public Map1() {
		runMap();
	}
	
	private void runMap() {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Last Tantasy");
		
		GamePanel gamePanel = new GamePanel(this);
		
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.setUpGame();
		
		gamePanel.startGameThread();
		
	}
}
