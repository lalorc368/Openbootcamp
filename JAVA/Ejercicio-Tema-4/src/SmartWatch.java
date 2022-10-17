public class SmartWatch extends SmartDevice {

        String marca;
        String modelo;
        String color;
        int size;

    public SmartWatch(String marca, String modelo, String color, int size){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.size = size;

        
    
    }

    @Override
    public String toString() {
        return "SmartWatch [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", size=" + size + "]";
    }        

    
}
