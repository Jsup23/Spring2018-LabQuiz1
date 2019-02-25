/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author jjoec
 */
public class Textbook {
    String title;
    String publisher;
    int edition;
    
    public Textbook() {
        title = "";
        publisher = "";
        edition = 0;
    }
    
    public Textbook(String name, String maker, int version) {
        title = name;
        publisher = maker;
        edition = version;
    }
    
    public String toString() {
        return title + "\n" + publisher + "\n" + edition;
    }
    
}
