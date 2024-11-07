package clase_Enums;

public class Main {

	public static void main(String[] args) {

		Developer[] developers = new Developer[3];
        developers[0] = new Developer("Juan", "Pérez", 30, "12345678A", Profesions.BACK_END_DEVELOPER);
        developers[1] = new Developer("Ana", "García", 25, "23456789B", Profesions.FRONT_END_DEVELOPER);
        developers[2] = new Developer("Luis", "Martínez", 35, "34567890C", Profesions.FULL_STACK_DEVELOPER);
        
        for (Developer dev : developers) {
            if (dev.getRolTecnologic() == Profesions.BACK_END_DEVELOPER && dev.getRolTecnologic() == Profesions.FULL_STACK_DEVELOPER) {
                System.out.println("Visca el Back");
            }else if (dev.getRolTecnologic() == Profesions.FRONT_END_DEVELOPER) {
                System.out.println("JS es una 💩 és millot TypeScript");
            }
        }
	}
}
