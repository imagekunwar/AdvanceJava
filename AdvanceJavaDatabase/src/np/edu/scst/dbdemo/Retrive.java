
package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrive {
    public static void main(String[]args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpdb","root","");
        
        Statement stmnt=con.createStatement();
        
        String sql="SELECT * FROM students";
  
        System.out.println(sql);
        ResultSet rs=stmnt.executeQuery(sql);
        System.out.println("id\tname\tage\tprogram\tsubject");
        
        while(rs.next()){
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getInt("age")+"\t");
            System.out.print(rs.getString("program")+"\t");
            System.out.print(rs.getString("subject")+"\t");
        }
        stmnt.execute(sql);
        stmnt.close();
        con.close();
        
    
}
}
