/**
 * File         : BangunDatarGenericTest.java
 * Penulis      : Thirafi Syahir Saputra
 * NIM          : 24060121140139
 * Deskripsi    : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran lingkaran1 = new Lingkaran(2);
        BangunDatarGeneric <Lingkaran> bdg = new BangunDatarGeneric <Lingkaran>();
        bdg.set(lingkaran1);

        System.out.println("keliling lingkaran :" +bdg.hitungKeliling());
        System.out.println("tipe generic :" +bdg.get().getClass().getName());
    }
    
}
