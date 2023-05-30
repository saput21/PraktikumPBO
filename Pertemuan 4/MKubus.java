/** 
* File      : MKubus.java
* Penulis   : Thirafi Syahir Saputra
* NIM       : 24060121140139
* Deskripsi : driver class untuk poligon, bujursangkar dan kubus
*/

package main;

import bangunruang.Kubus;
import bangundatar.BujurSangkar;
 
public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas());
        System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume());
    }    
}
