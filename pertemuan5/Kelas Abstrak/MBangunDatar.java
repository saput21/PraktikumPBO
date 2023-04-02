/** 
* File      : MBangunDatar.java
* Penulis   : Thirafi Syahir Saputra
* Deskripsi : Kelas yang mengimplementasi cara menghitung luas bujur sangkar
*
*/

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();  //Abstract variabel sisi dimasukan pada bs.HitungLuas(sis));

        System.out.println("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble(); //inputan akan masuk ke variabel sisi
        scan.close(); //menutup inputan

        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}
