/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Update {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    FasilitasSMD perintah = new FasilitasSMD();
    Sumedang atk = new Sumedang();
        atk.setNo_Kursi("B002");
        atk.setNama("BUKU GAMBAR");
        atk.setJumlah(12);
        atk.setTujuan("Sumedang");
        atk.setHarga(3000);
        perintah.update(atk);
    }
    
}
