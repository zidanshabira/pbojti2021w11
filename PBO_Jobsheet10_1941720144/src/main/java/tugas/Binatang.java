/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Zidan
 */
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    public Binatang(String nama, int jmlKaki){
        this.nama=nama;
        this.jmlKaki=jmlKaki;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setKaki(int jmlKaki){
        this.jmlKaki=jmlKaki;
    }
    
    public int getKaki(int jmlKaki){
        return jmlKaki;
    }
    
    public abstract void displayBinatang();
}
