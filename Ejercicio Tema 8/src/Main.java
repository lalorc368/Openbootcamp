public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jose");
        persona.setEdad(23);
        persona.setTelefono(123456789);
        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getTelefono());

    }
}

class Persona {
    private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    private int telefono;
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
    private int edad;

    public void setEdad(int edad){
        this.edad = edad;
    }
    //get
    public int getEdad(){
        return edad;

    }
}