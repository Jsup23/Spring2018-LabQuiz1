/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjoec
 */
public class CourseScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor base = new Instructor();
        Instructor argumented = new Instructor("Christopher", "Cannnon", "Cherry", 124);
        Textbook noArg = new Textbook();
        Textbook arg = new Textbook("Eragon", "Paolini", 1);
        Course course = new Course("COMP 167", "Spring", argumented, arg);
        
        System.out.println(base.toString());
        System.out.println(argumented.toString());
        
        System.out.println(noArg.toString());
        System.out.println(arg.toString());
        
        System.out.println(course.toString());
        
        ArrayList<Course> courses = new ArrayList<>();
        readCourseData(courses, args[0]);
        for(int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).toString());
        }
    }
    
    public static void readCourseData(ArrayList<Course> courses, String filename) {
        try {
            Scanner scan = new Scanner(new File(filename));
            while(scan.hasNext()) {
                Course course;
                Instructor teacher;
                Textbook book;
                
                //Fill instructor
                String[] line = scan.nextLine().split(",");
                String[] instructor;
                instructor = scan.nextLine().split(" \\* ");
                teacher = new Instructor(instructor[0], instructor[1], instructor[2], Integer.parseInt(instructor[3]));
                
                //Fill textbook
                String title = scan.nextLine().trim();
                String publisher = scan.nextLine().trim();
                int edition = Integer.parseInt(scan.nextLine().trim());
                book = new Textbook(title, publisher, edition);
                
                //Fill course
                course = new Course(line[0].trim(), line[1].trim(), teacher, book);
                courses.add(course); // add to ArrayList
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
            System.exit(-1);
        }
        
    }
}
