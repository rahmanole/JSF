package controller;

import entity.Student;
import java.util.List;
import javax.faces.bean.ManagedBean;
import services.StudentService;

/**
 *
 * @author Student J2ee-37
 */
@ManagedBean
public class StudentController {
    private Student student;
    private List<Student> students;
    private StudentService studentService;
    
    public void save(){
        System.out.println("Save button is clicked!!"+student.getName());
    }

    public Student getStudent() {
        if(student == null ){
        student=new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    
    
}
