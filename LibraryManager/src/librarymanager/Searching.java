/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Searching {
    //This class help store some temprary arrays (HashMap)
    /* When output the information in the table when searching,
       the program will go here to get information from the array.
    */
    
    //Search info of student by name (last name)
    //key = username, value = Student
    HashMap<String, Student> searchStudentByName = new HashMap<>();
    
    //Search info of student by ID Student
    //key = username, value = Student
    HashMap<String, Student> searchStudentById = new HashMap<>();
    
    //Search info of book by title
    //key = idBook, value = Book
    HashMap<String, Book> searchBookByName = new HashMap<>();
    
    //Search info of book by ID Book
    //key = idBook, value = Book
    HashMap<String, Book> searchBookById = new HashMap<>();
    
    
    
    //Getter and setters
    public HashMap<String, Student> getSearchStudentByName() {
        return searchStudentByName;
    }

    public void setSearchStudentByName(HashMap<String, Student> searchStudentByName) {
        this.searchStudentByName = searchStudentByName;
    }

    public HashMap<String, Student> getSearchStudentById() {
        return searchStudentById;
    }

    public void setSearchStudentById(HashMap<String, Student> searchStudentById) {
        this.searchStudentById = searchStudentById;
    }

    public HashMap<String, Book> getSearchBookByName() {
        return searchBookByName;
    }

    public void setSearchBookByName(HashMap<String, Book> searchBookByName) {
        this.searchBookByName = searchBookByName;
    }

    public HashMap<String, Book> getSearchBookById() {
        return searchBookById;
    }

    public void setSearchBookById(HashMap<String, Book> searchBookById) {
        this.searchBookById = searchBookById;
    }
    //End of getters and setters
    
    
}
