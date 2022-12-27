/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class INSERT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FasilitasSMD perintah = new FasilitasSMD();
        Sumedang atk = new Sumedang();
        atk.setNo_Kursi("F22");
        atk.setNama("Buku Tulis");
        atk.setJumlah(2);
        atk.setTujuan("Sumedang");
        atk.setHarga(3000);
        perintah.insert(atk);
        
        FasilitasBDG isi = new FasilitasBDG();
        Bandung bd = new Bandung();
        bd.setNo_Kursi("LK21");
        bd.setNama("Buku Tulis");
        bd.setJumlah(2);
        bd.setTujuan("Sumedang");
        bd.setHarga(3000);
        isi.insert(bd);
    }
    
}
