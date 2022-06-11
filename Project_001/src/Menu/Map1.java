package Menu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Map1 {

	public JFrame window = new JFrame();
	public CardLayout cardLayout = new CardLayout();
	public JPanel panel = new JPanel(cardLayout);

	public GamePanel gamePanel = new GamePanel(this);

	public Map1() {
		runMap();
	}

	private void runMap() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Last Tantasy");

		window.add(gamePanel);

		window.pack();

		window.setLocationRelativeTo(null);
		window.setVisible(true);

		gamePanel.setUpGame();

		gamePanel.startGameThread();

	}
}
