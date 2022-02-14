package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {
    public static void main(String[]args) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpdb","root","");
        
        Statement stmnt=con.createStatement();
        
        String sql="INSERT INTO students(name,age,program,subject)VALUES('ram',21,'bca','java')";
        System.out.println(sql);
        stmnt.execute(sql);
        stmnt.close();
        con.close();
        
        
        
    }
    
}
