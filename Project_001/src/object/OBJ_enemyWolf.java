package object;

import javax.imageio.ImageIO;

public class OBJ_enemyWolf extends SuperObject{

	public OBJ_enemyWolf() {
		name = "Wolf";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Dragon.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
