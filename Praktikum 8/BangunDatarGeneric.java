/**
 * File         : BangunDatarGeneric.java
 * Penulis      : Thirafi Syahir Saputra
 * NIM           : 24060121140139
 * Deskripsi    : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric <T5 extends BangunDatar>{ 
    private T5 bangunDatar;
    //v=

    public void set(T5 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    //Mengatur 

    public T5 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/** Jadi, dengan mengganti karakter 'T' menjadi karakter lain seperti 'T5', kita hanya memberikan 
nama yang berbeda untuk parameter tipe generik. Ini memungkinkan kita untuk membuat variasi dari 
kelas generik yang sama dengan batasan tipe yang berbeda-beda.
Penggunaan 'T1', 'T2', atau 'T1234' sebagai pengganti karakter 'T' hanya mempengaruhi 
penamaan variabel dan tipe kelas, tetapi konsep dasar dan fungsionalitas dari kelas generik tetap sama.
*/
