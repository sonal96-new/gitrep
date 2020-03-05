package in.ttn.Impl.Student;

import org.osgi.service.component.annotations.Deactivate;

import java.util.List;

public interface StudentService2
{
    void addStudent(Student student);
    Student getStudent(int id);
    void isStudentPassed(int id);
    List<Student> getAllStudents();
    void deleteStudent(int id);
}


