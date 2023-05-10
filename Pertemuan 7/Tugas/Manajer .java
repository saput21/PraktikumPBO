/** 
* File      : Manajer.java
* Penulis   : Thirafi Syahir Saputra
* Deskripsi : Kelas yang berupa metode untuk menghitung gaji manajer
*
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000; 
    
    public Manajer(String nama) {
        super.SetNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan); //this untuk nunjuk parameter
    }
}
