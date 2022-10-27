package tema5;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

        System.out.println(cocheCrud.save());
        System.out.println(cocheCrud.findAll());
        System.out.println(cocheCrud.delete());
    }
}
