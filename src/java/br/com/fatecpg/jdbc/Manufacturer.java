package br.com.fatecpg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jefferson V.
 */

public class Manufacturer {

    private int id;
    private String nome;
    private String cidade;
    private String estado;
    private String email;
    private String produto;

    public static ArrayList<Manufacturer> getList() throws Exception {
        ArrayList<Manufacturer> list = new ArrayList<>();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM MANUFACTURER");
        while (rs.next()) {
            Manufacturer c = new Manufacturer();
            c.setId(rs.getInt("MANUFACTURER_ID"));
            c.setNome(rs.getString("NAME"));
            c.setCidade(rs.getString("CITY"));
            c.setEstado(rs.getString("STATE"));
            c.setEmail(rs.getString("EMAIL"));
            list.add(c);
        }
        rs.close();
        st.close();
        con.close();
        return list;
    }
    
    public static ArrayList<Manufacturer> getDetails(int id) throws Exception {
        ArrayList<Manufacturer> detalhes = new ArrayList<>();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT DESCRIPTION FROM PRODUCT WHERE MANUFACTURER_ID = " + id);
        while (rs.next()) {
            Manufacturer c = new Manufacturer();
            c.setProduto(rs.getString("DESCRIPTION"));
            detalhes.add(c);
        }
        rs.close();
        st.close();
        con.close();
        return detalhes;
    }

    public Manufacturer() {

    }

    public Manufacturer(int id, String nome, String cidade, String email) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
