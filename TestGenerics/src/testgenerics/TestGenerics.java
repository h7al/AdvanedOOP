/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgenerics;

/**
 *
 * @author hessaalseiari
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyGenericList<Journal> journalList = new MyGenericList<>();
        journalList.addItem(new Journal("Science and life", "Sara", 2024));

        MyGenericList<Library> libraryList = new MyGenericList<>();
        libraryList.addItem(new Library("Central Library", "Tokyo", true));
    }
   
}
