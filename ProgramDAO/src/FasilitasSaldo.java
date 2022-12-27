
import static java.rmi.Naming.list;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author ALKARIZQY
 */
public class FasilitasSaldo {
    private final Connection koneksi;
    public FasilitasSaldo() {
 koneksi = KoneksiDatabase.getKoneksi();
 }
 public void insert(SALDO barang){
 PreparedStatement prepare = null;
 try {
    String sql ="INSERT INTO saldo(Username,Saldo)VALUES(?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, barang.getSaldo());
    prepare.setString(1, barang.getUsername());
    
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
 
 public void update(SALDO barang){
    PreparedStatement prepare = null;
 try {
 String sql ="UPDATE saldo SET Saldo=?, WHERE Username=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, barang.getUsername());
    prepare.setString(2, barang.getSaldo());
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
 String sql ="DELETE FROM saldo WHERE Username=?";
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
public List<SALDO> selectAll(){
 PreparedStatement prepare = null;
 ResultSet result = null;
 List<SALDO> list = new ArrayList<>();
 try {
 String sql ="SELECT * FROM saldo WHERE Username=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
 while (result.next()){
    SALDO barang = new SALDO();
    barang.setUsername(result.getString("USERNAME"));
    barang.setSaldo(result.getString("SALDO"));
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

PreparedStatement prepare = null;
 ResultSet result = null;
  List<SALDO> daftar = new ArrayList<>();
    List<SALDO> selectAll(SALDO L){
     try {
 String sql ="SELECT * FROM saldo WHERE Username=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
 while (result.next()){
    SALDO barang = new SALDO();
    barang.setUsername(result.getString("USERNAME"));
    barang.setSaldo(result.getString("SALDO"));
    daftar.add(barang);
 }
        System.out.println("Prepare statement berhasil dibuat");
 return daftar;
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat"); 
        System.out.println("Pesan : " + ex.getMessage());
 return daftar;
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