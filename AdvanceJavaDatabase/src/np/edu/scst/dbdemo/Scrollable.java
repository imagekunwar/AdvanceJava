
package np.edu.scst.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scrollable {
    public static void main(String[]args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/ajpdb","root","");
        
        Statement stmnt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        String sql="SELECT * "+"FROM Students";
        ResultSet rs=stmnt.executeQuery(sql);
        System.out.println("before");
        System.out.println("ID\t NAME\t GENDER\t SALARY");
        
         while(rs.next()){    //next() method is in result set where it point next row if exist
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getInt("age")+"\t");
            System.out.print(rs.getString("program")+"\t");
            System.out.print(rs.getString("subject")+"\t");
        }
         rs.absolute(2);//point the second row
         int newAge=rs.getInt("age")+25;
         rs.updateInt("age", newAge);
         rs.updateRow();
         
         rs=stmnt.executeQuery(sql);
         System.out.println("after");
         rs = stmnt.executeQuery(sql);
         System.out.println("ID\t NAME\t GENDER\t SALARY");
          while(rs.next()){    //next() method is in result set where it point next row if exist
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
