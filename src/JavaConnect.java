
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    static Connection conn;
    public static Connection ConnDB(){
        
  
        try{
            Class.forName("org.sqlite.JDBS");
            conn=DriverManager.getConnection("jdbc:sqlite:D:\\Fall2017\\LMS\\LibraryManagmentSystem\\LibraryManagmentSystem\\LibraryNew.sqlite");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
