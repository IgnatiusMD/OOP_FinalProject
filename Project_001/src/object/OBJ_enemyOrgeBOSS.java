package object;

import javax.imageio.ImageIO;

public class OBJ_enemyOrgeBOSS extends SuperObject{

	public OBJ_enemyOrgeBOSS() {
		name = "Ogre Boss";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Ogre.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
