/** 
 * File      : Poligon.java
 * Penulis   : Thirafi Syahir Saputra
 * NIM       : 24060121140139
 * Deskripsi : representasi dasar dari objek poligon (segi banyak)
 */

package poligon;

public class Poligon{
    protected int jumlahSisi;

    public Poligon(){               //Konstraktor
        this.jumlahSisi = 0;
    }

    public void getJumlahSisi(int jumlahSisi){
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi(){     //Fungsi mendapatkan jumlah sisi dari poligon
        return this.jumlahSisi;
    }
}
