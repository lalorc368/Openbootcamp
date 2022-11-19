package T5;

public class Main {

    static CocheCRUD cocheCRUD;

    CocheCRUDImpl cochesCRUD = new CocheCRUDImpl();

    CocheCRUDImpl Gti = new CocheCRUDImpl("VW","GTI", 2021);

    public static void main(String[] args) {

        cocheCRUD.save(new CocheCRUDImpl());
        cocheCRUD.findAll();
        cocheCRUD.delete(new CocheCRUDImpl());

    }
}
