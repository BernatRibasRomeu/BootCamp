package clase_Empresa;

public class Main {

	public static void main(String[] args) {
		Persones p = new Persones("Bernat", "Ribas Romeu", "123", "Client");
		System.out.println(p.toString());
		Clients c = new Clients("Bernat", "Ribas Romeu", "123", "Client", "Fuster", 0);
		System.out.println(c.toString());
		Treballadors t = new Treballadors("Bernat", "Ribas Romeu", "123", "Client", "Fixe", 1500);
		System.out.println(t.toString());
	}
}
