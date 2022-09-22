public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ();
        Trabajador trabajador = new Trabajador ();
        cliente.nombre = "Jose";
        cliente.edad = 28;
        cliente.telefono = 123456789;
        cliente.credito = 18000;
        System.out.println("Este es Cliente");
        System.out.println(cliente.nombre + " " + cliente.edad + " " + cliente.telefono + " " + cliente.credito);
        trabajador.nombre = "Eduardo";
        trabajador.edad = 30;
        trabajador.telefono = 951251639;
        trabajador.credito = 0;
        trabajador.salario = 18000;
        System.out.println("Este es Trabajador");
        System.out.println(trabajador.nombre + " " + trabajador.edad + " " + trabajador.telefono + " " + trabajador.credito + " "+ trabajador.salario);
    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {

    int credito;
}

class Trabajador extends Cliente  {
    int salario;

}