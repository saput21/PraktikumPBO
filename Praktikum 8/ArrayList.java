import java.util.ArrayList;

/*
 Nama: Thirafi Syahir Saputra
 NIM: 24060121140139

*/

public class ArrayListTest {
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat
        //berisi objek String
        ArrayList <String> string = new ArrayList<String>();
        
        //menambah elemen
        string.add("praktikum");
        string.add("collection");
        string.add("dan generics");
        
        //menghapus elemen
        string.remove("praktikum");
        System.out.println();
        
        //iterasi pada keseluruhan ArrayList
        for(String s : string){
            System.out.println(s+" ");
        }
    }
}
