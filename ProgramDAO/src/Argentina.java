/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author hp
 */
public class Argentina {
    @TableColumn(number=1, name ="No_Kursi")
    private String no_kursi;
    @TableColumn(number=2, name ="NAMA")
    private String nama;
    @TableColumn(number=3, name ="JUMLAH")
    private int jumlah;
    @TableColumn(number=4, name ="TUJUAN")
    private String tujuan;
    @TableColumn(number=5, name ="HARGA")
    private long harga; 
    public String getNo_Kursi() {
        return no_kursi;
    }

    public void setNo_Kursi(String no_kursi) {
        this.no_kursi = no_kursi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
}
