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
public class Main {
    public static void main(String[] args) {
        Singa sg=new Singa("Singa",4,"rrraaaaauuuu","Coklat Keemasan");
        Keledai kld=new Keledai("Keledai",4,"ngiihhaa","Abu-abu");
        Gorilla grl=new Gorilla("Gorilla",2,"gwaooo","Hitam ke Abu-Abu an");
        
        sg.displayBinatang();
        sg.displayMakan();
        sg.displayData();
        System.out.println("");
        kld.displayBinatang();
        kld.displayMakan();
        kld.displayData();
        System.out.println("");
        grl.displayBinatang();
        grl.displayMakan();
        grl.displayData();
        System.out.println("");
    }
}
