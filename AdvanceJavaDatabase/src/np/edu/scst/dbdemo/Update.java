
package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[]args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpdb","root","");
        
        Statement stmnt=con.createStatement();
        
        String sql="UPDATE students SET program= 'BE' WHERE id= 1";
        System.out.println(sql);
        stmnt.execute(sql);
        stmnt.close();
        con.close();
        
        
        
    }

}
