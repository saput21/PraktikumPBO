/** 
* File      : AngkaSialException.java
* Penulis   : Thirafi Syahir Saputra
* Deskripsi : Exception buatan sendiri, menolak masukan angka 13!
*
*/

public class AngkaSialException extends Exception{
    //konstruktor
    public AngkaSialException(){
        super("jangan masukan angka 13 karena angka sial !!!");
    }
}
