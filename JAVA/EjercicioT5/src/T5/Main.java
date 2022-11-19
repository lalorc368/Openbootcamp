package T5;

public class Main {

    static CocheCRUD cocheCRUD;

    public static void main(String[] args) {

        cocheCRUD.save(new CocheCRUDImpl());
        cocheCRUD.findAll();
        cocheCRUD.delete(new CocheCRUDImpl());

    }
}
