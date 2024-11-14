package panel;

import javax.swing.JOptionPane;

public class main_pregunta {

	public static void main(String[] args) {
		String nom = "";
		do {
			nom = JOptionPane.showInputDialog(null, "Com et dius?");
			
			if (nom != null) {
				JOptionPane.showMessageDialog(null, nom, "Resposta", 1);
			} else {
				JOptionPane.showMessageDialog(null, "Has tencat o cancelat la finestra", "Alerta", 2);
			}
		}while(nom == null);
	}
}
