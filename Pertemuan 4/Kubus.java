/** 
* File      : Kubus.java
* Penulis   : Thirafi Syahir Saputra
* NIM       : 24060121140139
* Deskripsi : driver class untuk poligon dan kubus
*/

package bangunruang;

import bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus (BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas(){
        double panjangSisi = permukaan.getPanjangSisi();        //sebenarnya duplicate code, tapi untuk
        return panjangSisi * panjangSisi;
    }
}
