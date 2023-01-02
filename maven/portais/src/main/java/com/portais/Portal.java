package com.portais;

import java.util.ArrayList;

public class Portal {
    public String name;
    public int id;
    public ArrayList<Ferramenta> ferramentas;
    
    public Portal(String name, int id){
        this.name = name;
        ferramentas = new ArrayList<Ferramenta>();
        this.id = id;
    }

    public void AddFerramenta(Ferramenta ferramenta){
        ferramentas.add(ferramenta);
    }
}
