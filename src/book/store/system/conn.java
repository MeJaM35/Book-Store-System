package book.store.system;
import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    

    public conn(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql:///book_store", "root", "meet2004");
            s = c.createStatement();

        
        } catch (Exception e){

            e.printStackTrace();
        }
    }
}
