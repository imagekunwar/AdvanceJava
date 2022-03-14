
package np.edu.scst.advancejavalab.lab3;
import java.sql.*;
import java.io.*;

public class AvengerCharacters {
    public static void main (String[]args) throws Exception{
        
        String url="jdbc:mysql://localhost:3306/avengerdb";
        String uname="root";
        String passw="";
        
        String query="insert into avengers values(1,"Odinson","Thor","Mars")";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,uname,passw);
        Statement stmnt=conn.CreateStatement();
        int count=Stmnt.executeUpdate(query);
        
        stmnt.close();
        conn.close();
    }
    ""
}
