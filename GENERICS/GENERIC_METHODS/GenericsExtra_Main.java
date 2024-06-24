package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExtra_Main {
    
    public static void main(String[] args){
        int studentCount=0;
        List<Student> students = new ArrayList<>();
        for(int i=0;i<studentCount;i++){
            students.add(new Student());
        }

        //printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i=0;i<studentCount;i++){
            lpaStudents.add(new LPAStudent());
        }
        //printList(lpaStudents);
        printMoreLists(lpaStudents);
    }

    public static <T extends Student> void printMoreLists(List<? extends Student> students){
        for(var student :students){
            System.out.println(student.getYearStarted()+ ": " + student);
        }
        System.out.println();
    }

    public static <T extends Student> void printList(List<T> students){
        for(var student :students){
            System.out.println(student.getYearStarted()+ ": " + student);
        }
        System.out.println();
    }
}
