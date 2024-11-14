package panel;

import javax.swing.JFrame;
import java.awt.*;

public class main_frame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(800, 600);
		frame.setTitle("Fundación Esplai");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setLocationRelativeTo(null);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./favicon.ico"));

        // Hacer visible el JFrame
        frame.setVisible(true);
	}
}
