package Menu;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	//Screen Settings
	//size for characters, objects, etc
	
	/*if tile as standard measurement is being used*/
	final private int objectTileSize = 34; //16x16
	final private int scale = 2;
	
	final private int actualTileSize = objectTileSize * scale; //48x48
	final private int maxTileColCount = 16;
	final private int maxTileRowCount = 12;
	final private int screenWidth = actualTileSize * maxTileColCount; // 1088 pixels
	final private int screenHeight = actualTileSize * maxTileRowCount;// 1088 pixels
	
	/*Using Coordinates*/
//	final int screenWidth = 1080;
//	final int screenHeight = 1080;
	
	Thread gameThread = new Thread(this);
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
	}
	
	public void startGameThread() {
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		while(gameThread != null) {
			System.out.println("Hello World!");
		}
		
	}
	
	//Game Loop
}
