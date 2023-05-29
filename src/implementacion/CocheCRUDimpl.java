package implementacion;

import interfaces.CocheCRUD;
import variables.Coches;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDimpl implements CocheCRUD {


    List<Coches> coches = new ArrayList<>();
    @Override
    public void save(Coches autos) {
        coches.add(autos);
    }

    @Override
    public List<Coches> findAll() {
        System.out.println(coches);
        return coches;
    }

    @Override
    public void delete(Coches autos) {
        coches.remove(autos);
    }
}
