package T5;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    String make;
    String model;
    int year;

    public CocheCRUDImpl(){}

    public CocheCRUDImpl(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public void save(CocheCRUDImpl coches) {

    }
    @Override
    public List<CocheCRUDImpl> findAll() {
        return null;
    }

    @Override
    public void delete(CocheCRUDImpl coches) {

    }
}
