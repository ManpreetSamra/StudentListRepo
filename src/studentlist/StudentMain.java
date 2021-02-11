/*
 * Your Manpreet Samra
 * Student ID:991 511 177
 * SYST10199 - web programming
 */
package studentlist;
import java.util.Scanner;

/**
 *
 * @author gurus
 */
public class StudentMain {
    public static void main(String[] args){
    
    StudentList[] studentArray=new StudentList[2];
    Scanner input=new Scanner(System.in);
    for(int i=0;i<studentArray.length;i++){
    System.out.print("Enter the student name : ");
    String name=input.nextLine();
    System.out.println();
    StudentList Student=new StudentList(name);
    studentArray[i]=Student;
    }
    System.out.println("Printing the Students:");
    String format="The student's name is %s \n";
    
    for(StudentList Student:studentArray){
    System.out.printf(format, Student.getName());
    }
}    
}
