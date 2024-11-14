package panel;

import javax.swing.JOptionPane;

public class main_panel {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Missatge informatiu" , "Info", 1);
		JOptionPane.showInternalMessageDialog(null, "Missatge d'error", "Error", 0);
		JOptionPane.showInternalMessageDialog(null, "Missatge d'avís", "Avís", 2);
		String text = "El total és:\n"
				+ "\t120€ (IVA 10% no incl.)\n"
				+ "\t132€ (IVA incl.";
		JOptionPane.showMessageDialog(null, text , "Ticket", 1);
	}

}
