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
public class SALDO {
    @TableColumn(number=1, name ="SALDO")
    private String saldo;    
    @TableColumn(number=1, name ="USERNAME")
    private String username;    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    }

