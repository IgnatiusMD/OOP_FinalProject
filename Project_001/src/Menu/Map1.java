package Menu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.*;

public class Map1 {
	private KeyHandler keyH = new KeyHandler();
	
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
		CombatPanel cp = new CombatPanel(this);
		
		panel.add(gamePanel, "game");
		panel.add(cp, "combat");
		
		window.add(panel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGameThread();
		
	}
	
	public void disablePressedKeys() {
		keyH.upPressed = false;
		keyH.downPressed = false;
		keyH.rightPressed = false;
		keyH.leftPressed = false;
	}
	
	public KeyHandler getkeyH() {
		return this.keyH;
	}
}
