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
public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;
    
     public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama Hewan :"+super.nama);
        System.out.println("Jumlah Kaki :"+super.jmlKaki);
    }

    @Override
    public void displayMakan() {
            System.out.println("Gorilla adalah jenis Hewan Karnivora dan juga Herbivora");
    }
    
    public void displayData(){
        System.out.println("Suara: "+this.suara);
        System.out.println("Warna Bulu :"+this.warnaBulu);
    } 
}
