package Menu;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	//Screen Settings
	//size for characters, objects, etc
	
	/*if tile as standard measurement is being used*/
//	final int objectTileSize = 16; //16x16
//	final int scale = 3;
//	
//	final int actualTileSize = objectTileSize * scale; //48x48
//	final int maxTileColCount = 16;
//	final int maxTileRowCount = 12;
//	final int screenWidth = actualTileSize * maxTileColCount; // 768 pixels
//	final int screenHeight = actualTileSize * maxTileRowCount;// 576 pixels
	
	/*Using Coordinates*/
	final int screenWidth = 1080;
	final int screenHeight = 1080;
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
	}
	
	//Game Loop
	@Override
	public void run() {
		
	}
}
