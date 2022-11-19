package T5;

import java.util.List;

public interface CocheCRUD {

    void save(CocheCRUDImpl coches);


    List<CocheCRUDImpl> findAll();

    void delete(CocheCRUDImpl coches);

}
