package Menu;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
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
		
	}

}