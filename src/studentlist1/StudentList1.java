/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist1;

/**
 *
 * @author Owner
 */
public class StudentList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] StudentList1 = new Student[3];
        Student s1 = new Student();
        s1.setName("Aryan Patel");
         Student s2 = new Student();
        s2.setName("Vraj Lakhani");
         Student s3 = new Student();
        s3.setName("Nakul Chaudhry");
        StudentList1[0] = s1;
        StudentList1[1] = s2;
        StudentList1[2] = s3;
        
        for (Student s : StudentList1) {
            System.out.println(s.getName());
        }
        
        
                
      
    }
    
}
