package Menu;
import PlayerJob.*;

public class Main {
	
	public static void gameLoop() {
		new Player();
	}
	
	public static void main(String[] args) {
		
		while(true) {
			gameLoop();
			break;
		}
		
	}

}