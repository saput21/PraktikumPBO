/** 
* File      : MLingkaran.java
* Penulis   : Thirafi Syahir Saputra
* Deskripsi : Implementasi cara menghitung luas lingkaran
*
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jejari lingkaran: ");
		double jejari = scan.nextDouble(); 
		scan.close(); 
		
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari "+ jejari +" satuan adalah "+l.hitungLuas());
	}
}
