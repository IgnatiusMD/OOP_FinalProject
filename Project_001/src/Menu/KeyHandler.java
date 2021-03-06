package Menu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	public boolean upPressed, downPressed, rightPressed, leftPressed;
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
			upPressed = true;
		}
		else if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
			leftPressed = true;
		}
		else if(keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
			downPressed = true;
		}
		else if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
			rightPressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
			upPressed = false;
		}
		else if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
			leftPressed = false;
		}
		else if(keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
			downPressed = false;
		}
		else if(keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
			rightPressed = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		if(keyCode == KeyEvent.VK_W) {
			upPressed = true;
		}
		else if(keyCode == KeyEvent.VK_A) {
			leftPressed = true;
		}
		else if(keyCode == KeyEvent.VK_S) {
			downPressed = true;
		}
		else if(keyCode == KeyEvent.VK_D) {
			rightPressed = true;
		}
		
	}

}
