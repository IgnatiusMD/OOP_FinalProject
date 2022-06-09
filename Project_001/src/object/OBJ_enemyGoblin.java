package object;

import javax.imageio.ImageIO;

public class OBJ_enemyGoblin extends SuperObject{

	public OBJ_enemyGoblin() {
		name = "Goblin";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Goblin.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
