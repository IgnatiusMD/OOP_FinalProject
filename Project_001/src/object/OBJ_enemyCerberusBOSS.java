package object;

import javax.imageio.ImageIO;

public class OBJ_enemyCerberusBOSS extends SuperObject{

	public OBJ_enemyCerberusBOSS(){
		name = "Key";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Cerberus.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		collision = true;
	}

}
