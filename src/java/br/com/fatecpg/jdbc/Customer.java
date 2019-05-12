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
public class Customer {

    private int id;
    private String name;
    private String email;
    private String produtos;
    private double valor;
    private int Qtde;

    public static ArrayList<Customer> getList() throws Exception {
        ArrayList<Customer> list = new ArrayList<>();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM CUSTOMER");
        while (rs.next()) {
            Customer c = new Customer();
            c.setId(rs.getInt("CUSTOMER_ID"));
            c.setName(rs.getString("NAME"));
            c.setEmail(rs.getString("EMAIL"));
            list.add(c);
        }
        rs.close();
        st.close();
        con.close();
        return list;
    }

    public static ArrayList<Customer> getDetails(int id) throws Exception {
        
        ArrayList<Customer> produtos = new ArrayList<>();
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/sample";
        Connection con = DriverManager.getConnection(url, "app", "app");
        Statement st = con.createStatement();
        Statement st2 = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT PRODUCT_ID, QUANTITY FROM PURCHASE_ORDER WHERE CUSTOMER_ID = " + id);
        while (rs.next()) {
            Customer c = new Customer();
                c.setQtde(rs.getInt("QUANTITY"));
            ResultSet rs2 = st2.executeQuery("SELECT DESCRIPTION, PURCHASE_COST FROM PRODUCT WHERE PRODUCT_ID = " + rs.getInt("PRODUCT_ID"));
            while (rs2.next()) {
                c.setProdutos(rs2.getString("DESCRIPTION"));
                c.setValor(rs2.getDouble("PURCHASE_COST"));
                produtos.add(c);
            }
            rs2.close();
        }
        rs.close();
        st.close();
        st2.close();
        con.close();
        return produtos;
    }

    public Customer() {

    }

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return Qtde;
    }

    public void setQtde(int Qtde) {
        this.Qtde = Qtde;
    }

}
