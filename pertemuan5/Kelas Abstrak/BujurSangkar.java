/** 
* File      : BujurSangkar.java
* Penulis   : Thirafi Syahir Saputra
* Deskripsi : Kelas yang membuat implementasi metode abstrak pada bangun datar
*
*/

//turunan dari kelas bangun datar
public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){ //mengimplementasikan abstract method hitungLuas pada BangunDatara
        luas = sisi*sisi;
        return luas;
    }
}
