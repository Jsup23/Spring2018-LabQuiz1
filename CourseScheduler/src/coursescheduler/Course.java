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
public class Course {
    String name;
    String semester;
    Instructor instructor;
    Textbook textBook;
    
    public Course() {
        name = "";
        semester = "";
        instructor = null;
        textBook = null;
    }
    
    public Course(String cName, String semester, Instructor teacher, Textbook book) {
        name = cName;
        this.semester = semester;
        instructor = teacher;
        textBook = book;
    }
    
    public String toString() {
        return name + ", " + semester + "\n" + instructor.toString() + "\n" + textBook.toString();
    }
}
