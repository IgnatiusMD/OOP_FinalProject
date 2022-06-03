package tile;

import javax.imageio.ImageIO;

import Menu.GamePanel;

public class TileManager {

	GamePanel gp;
	Tile[] tile;
	
	public TileManager(GamePanel gp) {
		
		this.gp = gp;
		
		tile = new Tile[10];
		
		getTileImage();
		
	}
	
	public void getTileImage() {
		
		try {
			
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResource("/tiles"))
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
