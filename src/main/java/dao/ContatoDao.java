package dao;

import br.com.CRUDAGENDA.model.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao extends Contato {

    public List<Contato> Listar() {

        List<Contato> contatos = new ArrayList<Contato>();

        try {
            Connection con = new Connectionfactory().getConnection();
            PreparedStatement smt = con.prepareStatement("select * from contatos");
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                Contato c = new Contato();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setIdade(rs.getInt("idade"));
                c.setDataCadastro(rs.getDate("dataCadastro"));

                contatos.add(c);
            }
            rs.close();
            smt.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contatos;
    }
}