package Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CombatPanel extends JPanel {
	
	JButton backBtn = new JButton("Back");
	
	Map1 map1;
	
	public CombatPanel(Map1 map1) {
		this.map1 = map1;
		
		backBtn.addActionListener(e -> actionPerformed(e));
		this.add(backBtn);
	
		this.setPreferredSize(new Dimension(768, 576));
		this.setBackground(Color.RED);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
	}
	
	private void actionPerformed(ActionEvent e) { 
	   map1.cardLayout.show(map1.panel, "game");
	 } 
	
}
