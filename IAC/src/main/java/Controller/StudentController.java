package Controller;

import Domain.Student;


import java.util.ArrayList;
import java.util.Arrays;

public class StudentController {


    ArrayList<Student> results = new ArrayList<Student>(Arrays.asList(
            new Student("jan", 1,1),
            new Student("piet",2,1),
            new Student("geert",3,2),
            new Student("hein",4,2)
    ));


    public ArrayList<Student> getAllStudents(){


        return results;
    }
    public Student getStudent(int id){
        Student result = null;
        for (Student i : results){
            if (i.getStudentid() == id){
                result = i;
            }
        }
        return result;
    }
    public ArrayList<Student> getStudentByClass(int classid) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student i : results){
            if (i.getClassid() == classid){
                students.add(i);
            }
        }
        return students;
    }
    public Student addStudent(String name,int classid) {
        Student student = new Student(name,0,classid);
        System.out.println(student);
        return student;
    }
    public Student updateStudent(String name,int classid,int studentid) {
        Student student = new Student(name,studentid,classid);
        System.out.println(student);
        return student;
    }
    public Boolean deleteStudent(int id) {

        return true;
    }
}
