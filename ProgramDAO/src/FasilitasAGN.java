
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ALKARIZQY
 */
public class FasilitasAGN {
    private final Connection koneksi;
    public FasilitasAGN() {
 koneksi = KoneksiDatabase.getKoneksi();
 }
 public void insert(Argentina barang){
 PreparedStatement prepare = null;
 try {
    String sql ="INSERT INTO argentina(No_Kursi,Nama,Jumlah,Tujuan,Harga)VALUES(?,?,?,?,?)";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, barang.getNo_Kursi());
    prepare.setString(2, barang.getNama());
    prepare.setInt(3, barang.getJumlah());
    prepare.setString(4, barang.getTujuan());
    prepare.setLong(5, barang.getHarga());
    prepare.executeUpdate();
         System.out.println("Prepare statement berhasil dibuat");
         JOptionPane.showMessageDialog(null ,"PESANAN BERHASIL");
 }catch(SQLException ex){
        System.out.println("Prepare statement gagal dibuat"); 
        JOptionPane.showMessageDialog(null ,"KURSI SUDAH DIPESAN");
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
 
 public void update(Argentina barang){
    PreparedStatement prepare = null;
 try {
 String sql ="UPDATE argentina SET Nama=?,jumlah=?,tujuan=?,harga=? WHERE No_Kursi=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, barang.getNama());
    prepare.setInt(2, barang.getJumlah());
    prepare.setString(3, barang.getTujuan());
    prepare.setLong(4, barang.getHarga());
    prepare.setString(5, barang.getNo_Kursi());
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
 
 public void delete(String No_Kursi){
 PreparedStatement prepare = null;
 try {
 String sql ="DELETE FROM argentina WHERE No_Kursi=?";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    prepare.setString(1, No_Kursi);
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
public List<Argentina> selectAll(){
 PreparedStatement prepare = null;
 ResultSet result = null;
 List<Argentina> list = new ArrayList<>();
 try {
 String sql ="SELECT * FROM argentina";
    prepare = (PreparedStatement) koneksi.prepareStatement(sql);
    result = prepare.executeQuery();
 while (result.next()){
    Argentina barang = new Argentina();
    barang.setNo_Kursi(result.getString("No_Kursi"));
    barang.setNama(result.getString("Nama"));
    barang.setJumlah(result.getInt("jumlah"));
    barang.setTujuan(result.getString("tujuan"));
    barang.setHarga(result.getLong("harga"));
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