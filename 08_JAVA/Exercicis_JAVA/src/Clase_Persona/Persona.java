package Clase_Persona;

public class Persona {
	
	private String nom = "";
    private int edat = 0;
    
//	Getters i setters
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}
	
//	Contructors 
    public Persona() {
		
	}

    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
//    Metodes
    
    public void mostrarInfo () {
        System.out.println("Nom: " + nom + " Edat: " + edat);
    }
}
