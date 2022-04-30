package Menu;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	//Screen Settings
	//size for characters, objects, etc
	final int objectTileSize = 16; //16x16
	final int scale = 3;
	
	final int actualTileSize = objectTileSize * scale; //48x48
	final int maxTileColCount = 16;
	final int maxTileRowCount = 9;
	final int screenWidth = actualTileSize * maxTileColCount; // 768 pixels
	final int screenHeight = actualTileSize * maxTileRowCount;// 576 pixels
	
	
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
