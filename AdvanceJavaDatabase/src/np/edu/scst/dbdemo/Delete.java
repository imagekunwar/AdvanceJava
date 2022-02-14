
package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Delete {
    public static void main(String[]args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpdb","root","");
        
        Statement stmnt=con.createStatement();
        
        String sql="DELETE FROM students WHERE id= 2";
        System.out.println(sql);
        stmnt.execute(sql);
        stmnt.close();
        con.close();
        
    
}
}
