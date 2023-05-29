package main;

import interfaces.CocheCRUD;
import implementacion.CocheCRUDimpl;
import variables.Coches;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDimpl();
        Coches ToyotaYaris = new Coches("YARIS", "BLUE",2018,"TOYOTA");
        Coches NissanSentra = new Coches("SENTRA","RED",2017,"NISSAN");

        cocheCRUD.save(ToyotaYaris);
        cocheCRUD.findAll();
        cocheCRUD.save(NissanSentra);
        cocheCRUD.findAll();
        cocheCRUD.delete(NissanSentra);
        cocheCRUD.findAll();
    }

}
