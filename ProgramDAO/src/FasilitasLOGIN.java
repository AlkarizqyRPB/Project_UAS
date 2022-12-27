
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALKARIZQY
 */
public class FasilitasLOGIN {
    private final Connection koneksi;
    public FasilitasLOGIN() {
 koneksi = KoneksiDatabase.getKoneksi();
 }
 public void insert(LOGIN barang){
 PreparedStatement prepare = null;
 try {
    String sql ="INSERT INTO login(Username,Password)VALUES(?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, barang.getUsername());
    prepare.setString(2, barang.getPassword());
    prepare.executeUpdate();
         System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat"); 
        System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
    prepare.close();
        System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
        System.out.println("Prepare statemen gagal ditutup"); 
        System.out.println("Pesan : " + ex.getMessage());
    }
   }
  }
 }
 
 public void update(LOGIN barang){
    PreparedStatement prepare = null;
 try {
 String sql ="UPDATE login SET Password=?, WHERE Username=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, barang.getUsername());
    prepare.setString(2, barang.getPassword());
    prepare.executeUpdate();
        System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat"); 
        System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
    prepare.close();
        System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
        System.out.println("Prepare statemen gagal ditutup"); 
        System.out.println("Pesan : " + ex.getMessage());
      }
    }
   }
 } 
 
 public void delete(String Username){
 PreparedStatement prepare = null;
 try {
 String sql ="DELETE FROM login WHERE Username=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, Username);
    prepare.executeUpdate();
        System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat"); 
        System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{prepare.close();
        System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
        System.out.println("Prepare statemen gagal ditutup"); 
        System.out.println("Pesan : " + ex.getMessage());
    }
   }
  }
 }
public List<LOGIN> selectAll(){
 PreparedStatement prepare = null;
 ResultSet result = null;
 List<LOGIN> list = new ArrayList<>();
 try {
 String sql ="SELECT * FROM login";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
 while (result.next()){
    LOGIN barang = new LOGIN();
    barang.setUsername(result.getString("Username"));
    barang.setPassword(result.getString("Password"));
    list.add(barang);
 }
        System.out.println("Prepare statement berhasil dibuat");
 return list;
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat"); 
        System.out.println("Pesan : " + ex.getMessage());
 return list;
 }finally{
 if (prepare != null){
 try{
 prepare.close();
        System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
        System.out.println("Prepare statemen gagal ditutup"); 
        System.out.println("Pesan : " + ex.getMessage());
  }
 }
 if (result != null){
try{
 result.close();
        System.out.println("Resultset berhasil ditutup");
 }catch(SQLException ex){
        System.out.println("Resultset gagal ditutup"); 
        System.out.println("Pesan : " + ex.getMessage());
     }
    }
   }
 }
}