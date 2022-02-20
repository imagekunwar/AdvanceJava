
package np.edu.scst.dbdemo;
import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
    public static void main(String[]args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        JdbcRowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
        rs.setUrl("jdbc:mysql://localhost:3306/ajpdb");
        rs.setUsername("root");
        rs.setPassword("");
        
        rs.setCommand("select * from students ");
        rs.execute();
        
        while(rs.next()){
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("age")+"\t");
            System.out.print(rs.getString("program")+"\t");
            System.out.println(rs.getString("subject")+"\t");
            
            
      }
        rs.close();
                
        RowSetDemo rd=new RowSetDemo();
        
        
    }    
}
