/**
 * File      : Lambdalist.java
 * Penulis   : Thirafi Syahir Saputra
 * NIM       : 24060121140139
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Varrel");
        mahasiswaList.add("Inong");
        mahasiswaList.add("Erlan");
        mahasiswaList.add("Durapi");

        //lambda digunakan sebagai parameter pada method
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
