package clase_Enums;

public class Developer {

    private String name = "";
    private String surnames = "";
    private int age = 0;
    private String dni = "";
    private Profesions rolTecnologic;  // Cambiar el tipo a Profesions (el enum)

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Profesions getRolTecnologic() {
        return rolTecnologic;
    }

    public void setRolTecnologic(Profesions rolTecnologic) {
        this.rolTecnologic = rolTecnologic;
    }

    public Developer(String name, String surnames, int age, String dni, Profesions rolTecnologic) {
        this.name = name;
        this.surnames = surnames;
        this.age = age;
        this.dni = dni;
        this.rolTecnologic = rolTecnologic;
    }
}
