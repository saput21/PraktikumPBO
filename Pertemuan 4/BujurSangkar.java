/** 
 * File      : BujurSangkar.java
 * Penulis   : Thirafi Syahir Saputra
 * NIM       : 24060121140139
 * Deskripsi : representasi dari objek bujur sangkar, turunan kelas poligon
 */

package bangundatar;

import poligon.Poligon;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}
