
public class Main {


    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple", "Iphone 14", "Blanco, Rojo, Verde, Azul, Gris, Plata", 128, 12, 6.1);

        System.out.println(iphone);

        SmartPhone galaxy = new SmartPhone("Samsung", "Galaxy S22 Ultra", "Blanco, Negro, Rojo, Verde", 128, 108, 6.8);

        System.out.println(galaxy);

        SmartWatch iwatch = new SmartWatch("Apple", "Apple Watch Ultra", "Plata", 49);

        System.out.println(iwatch);

        SmartWatch galaxyw = new SmartWatch("Samsung", "Galaxy Watch 5 Pro", "Negro y Gris", 45);
        
        System.out.println(galaxyw);

    }

}