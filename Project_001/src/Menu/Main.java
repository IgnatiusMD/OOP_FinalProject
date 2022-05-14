package Menu;

import javax.swing.JFrame;

public class Main {

	public Main() {
		new MainMenu();
	}

	public static void main(String[] args) {
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
		new Main();
=======
>>>>>>> Stashed changes
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Last Tantasy");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		//Allows dimensions to adjust to screenHeight and screeWidth
		window.pack(); 
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGameThread();
<<<<<<< Updated upstream
=======
>>>>>>> ce592fdaffb56931ab99190efc70f2a6b66e694e
>>>>>>> Stashed changes
	}

}
