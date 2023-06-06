/**
 * File      : DAOManager.java
 * Penulis   : Thirafi Syahir Saputra 
 * Nama      : 24060121140139
 * Deskripsi : pengelola DAO dalam program
 *
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
