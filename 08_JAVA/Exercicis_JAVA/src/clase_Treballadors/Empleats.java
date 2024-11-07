package clase_Treballadors;

public class Empleats {
	
    private String nom;
    private String cognom1;
    private String cognom2;
    private float sou;

    public Empleats(String nom, String cognom1, String cognom2, float sou) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.sou = sou;
    }

    // Método toString para mostrar la información del empleado
    @Override
    public String toString() {
        return "Nom: " + nom + " " + cognom1 + " " + cognom2 + "\nSou: " + sou;
    }
}

class Programadors extends Empleats {
    private float bonus;

    public Programadors(String nom, String cognom1, String cognom2, float sou, float bonus) {
        super(nom, cognom1, cognom2, sou);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }
}