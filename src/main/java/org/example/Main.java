package org.example;

import br.com.CRUDAGENDA.model.Contato;
import dao.ContatoDao;

public class Main {

    public static void main(String[] args){

        ContatoDao dao = new ContatoDao();
        for(Contato c : dao.Listar()){
            System.out.println(c.toString());
        }

    }
}
