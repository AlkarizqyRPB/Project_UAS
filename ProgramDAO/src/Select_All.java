/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
/**
 *
 * @author hp
 */
public class Select_All {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    FasilitasLOGIN perintah = new FasilitasLOGIN();
    List<LOGIN> list = perintah.selectAll();
    for(LOGIN barang : list){
        System.out.println(barang.getUsername());
        System.out.println(barang.getPassword());
        System.out.println("-------------------------");
 }
    }
    
}
