package game.view;

import java.awt.*;
import javax.swing.*;

public class UserGuessesPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		public UserGuessesPanel()
			{
				baseLayout = new SpringLayout();
				
				buildPanel();
				buildWindow();
				buildListeners();
			}
			
			private void buildPanel()
			{
				setLayout(baseLayout);
				setBackground(Color.BLACK);
				this.setPreferredSize(new Dimension(200,478));
			}
			
			private void buildWindow()
			{
				
			}
			
			private void buildListeners()
			{
				
			}
	}
