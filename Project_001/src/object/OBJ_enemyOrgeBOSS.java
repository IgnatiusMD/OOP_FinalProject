package object;

import javax.imageio.ImageIO;

public class OBJ_enemyOrgeBOSS extends SuperObject{

	public OBJ_enemyOrgeBOSS() {
		name = "Orge Boss";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Dragon.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
