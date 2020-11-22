/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

/**
 *
 * @author ASUS
 */
public class LibraryManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame1_IntroMenu frame1 = new Frame1_IntroMenu();
        Frame2_LoginManager frame2 = new Frame2_LoginManager();
        Frame3_LoginStudent frame3 = new Frame3_LoginStudent();
        Frame4_RegisterManager frame4 = new Frame4_RegisterManager();
        Frame5_RegisterStudent frame5 = new Frame5_RegisterStudent();
        Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
        Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
        Frame8_ChangePassword frame8 = new Frame8_ChangePassword();
        Frame9_ManageStudents_General frame9 = new Frame9_ManageStudents_General();
        Frame10_ManageStudents_Detail frame10 = new Frame10_ManageStudents_Detail();
        Frame11_FineToPay frame11 = new Frame11_FineToPay();
        Frame12_SeeBorrowedBooks frame12 = new Frame12_SeeBorrowedBooks();
        Frame13_Book_Student frame13 = new Frame13_Book_Student();
        Frame14_Book_Manager frame14 = new Frame14_Book_Manager();
        Frame15_AddABook frame15 = new Frame15_AddABook();
        Frame16_ForgetThePassword frame16 = new Frame16_ForgetThePassword();
        Frame17_StudentBorrowBook frame17 = new Frame17_StudentBorrowBook();
        
        ManageData.getManageData().loadAllManager();
        ManageData.getManageData().loadAllStudent();
        ManageData.getManageData().loadAllBook();
        
        frame1.setVisible(true);
        
        /*for (Manager value : ManageData.getManageData().allManager.values()) {
            System.out.println("Username = " + value.getUsername());
            System.out.println("Pass = " + value.getPassword());
            System.out.println("Full name = " + value.getFullName());
            System.out.println("Email = " + value.getEmail());
            System.out.println("Phone = " + value.getPhone());  
            System.out.println("Link Image = " + value.getLinkOfAvatar()); 
        }*/
        
        
        /*for (Student value : ManageData.getManageData().allStudent.values()) {
            System.out.println("Username = " + value.getUsername());
            System.out.println("Pass = " + value.getPassword());
            System.out.println("Full name = " + value.getFullName());
            System.out.println("Email = " + value.getEmail());
            System.out.println("Phone = " + value.getPhone());  
            System.out.println("ID = " + value.getIdStudent());  
            System.out.println("Fine = " + value.getFine());  
            System.out.println("Link Image = " + value.getLinkOfAvatar()); 
        }*/
        
        /*for (Book value : ManageData.getManageData().allBook.values()) {
            System.out.println("Id = " + value.getIdBook());
            System.out.println("Title = " + value.getTitle());
            System.out.println("Category = " + value.getCategory());
            System.out.println("Author = " + value.getAuthor());
            System.out.println("Start Borrowed = " + value.getStartBorrowed());  
            System.out.println("End Borrowed = " + value.getEndBorrowedPrediction());  
            System.out.println("Available = " + value.getAvailable());  
            System.out.println("Link Image = " + value.getLink()); 
        }*/

        
    }
    
}
