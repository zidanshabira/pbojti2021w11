/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;
/**
 *
 * @author Zidan
 */
public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor=new Rektor();
        
        Sarjana sarjanaCum=new Sarjana("Dini");
        PascaSarjana masterCum=new PascaSarjana("Elok");
        
        //pakrektor.beriSertifikatMAwapres(sarjanaCum);
        pakrektor.beriSertifikatMAwapres(masterCum);
    }
}
