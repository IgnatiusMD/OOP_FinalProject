package object;

import javax.imageio.ImageIO;

public class OBJ_enemyImp extends SuperObject{

	public OBJ_enemyImp() {
		name = "Imp";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Dragon.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
