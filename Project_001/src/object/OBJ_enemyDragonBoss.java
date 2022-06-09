package object;

import javax.imageio.ImageIO;

public class OBJ_enemyDragonBoss extends SuperObject{
	
	public OBJ_enemyDragonBoss() {
		name = "Key";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Dragon.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
