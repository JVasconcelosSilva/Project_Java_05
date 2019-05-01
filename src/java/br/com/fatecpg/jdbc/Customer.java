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
    
    public static ArrayList<Customer> getListcompras() throws Exception {
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
}
