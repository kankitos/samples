/**
 * Created by developer on 8.9.2016.
 */


import java.sql.*;
public class Test {
    public static void main(String[] a)
            throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
                getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        // add application code here
        Statement stmt =  conn.createStatement();
        String query = "SELECT * FROM TEST";
        ResultSet rs =  stmt.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getString("ID"));
            System.out.println(rs.getString("NAME"));
        }
        conn.close();
    }
}
