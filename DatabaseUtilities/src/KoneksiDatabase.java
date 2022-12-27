/**
 *
 * @author alka
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi == null){
        try{
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
       String url="jdbc:mysql://localhost:3306/kereta_api";
       String user="root";
       String pass=""; 
       koneksi = DriverManager.getConnection(url, user, pass);
       System.out.println("Berhasil Terkoneksi");
       }catch(SQLException ex){
        System.out.println("Gagal Terkoneksi");
        System.out.println("Pesan : " + ex.getMessage());        
   } 
  }
return koneksi;
 }
}


