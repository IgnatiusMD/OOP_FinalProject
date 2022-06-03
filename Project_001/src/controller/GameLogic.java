package controller;
import java.util.ArrayList;

import NPC.*;

public class GameLogic {
	
	ArrayList <NPC> enemiesList = new ArrayList<>();
	Ogre boss = new Ogre();
	
	public GameLogic() {
		enemiesList.add(new Goblin());
		enemiesList.add(new Goblin());
		enemiesList.add(new Spider());
		enemiesList.add(new Spider());
		enemiesList.add(new Wolf());
		enemiesList.add(new Wolf());
		enemiesList.add(new Skeleton());
		enemiesList.add(new Skeleton());
	}
	
	public void processCommand(String[] commands) {
		
	}
}