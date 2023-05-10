/** 
* File      : Programmer.java
* Penulis   : Thirafi Syahir Saputra
* Deskripsi : Kelas yang berupa metode untuk menghitung gaji programmer
*
*/

public class Programmer extends Pegawai {
    private int bonus = 450000; 
    
    public Programmer(String nama) {
        super.SetNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
