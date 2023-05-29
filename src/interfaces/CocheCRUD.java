package interfaces;

import variables.Coches;

import java.util.List;

public interface CocheCRUD {

    void save(Coches autos);
    List<Coches> findAll();
    void delete(Coches autos);

}
