
public class SmartPhone extends SmartDevice {

        String marca;
        String modelo;
        String color;
        int almacenamiento;
        int pixCam;
        double tamPant;

    public SmartPhone(String marca, String modelo, String color, int almacenamiento, int pixCam, double tamPant){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.pixCam = pixCam;
        this.tamPant = tamPant;

        
    }

    @Override
    public String toString() {
        return "SmartPhone [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", almacenamiento="
                + almacenamiento + ", pixCam=" + pixCam + ", tamPant=" + tamPant + "]";
    }

    
}
