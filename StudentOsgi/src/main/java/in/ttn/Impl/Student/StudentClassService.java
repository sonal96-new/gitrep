package in.ttn.Impl.Student;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

@Component(service = StudentService2.class,immediate = true)
public class StudentClassService implements StudentService2
{
     List<Student> studentList=new ArrayList<Student>();

    Iterator iterator=studentList.iterator();

    @Reference
    StudentService1 studentService1;

    public void addStudent( Student  student)
    {

        if (studentService1.isClassLimitReached(studentList)){
            studentList.add(student);
            System.out.println( studentList);
        }

    }

  public   void isStudentPassed(int id)
    {
        if(getStudent(id).getMarks()>=studentService1.getPassingMarks()){
            System.out.println("Student "+id+" has Passed");
        }
        else {
            System.out.println("Student "+id+" has Failed");
        }
    }
    public Student getStudent(int id) {
        return studentList.stream().filter(e->e.getId()==id).findFirst().get();
    }

    public List<Student> getAllStudents() {
        return studentList;
    }
    public void deleteStudent(int id)
    {
        studentList.removeIf(e->e.getId()==id);
    }

    @Activate
    public void activate()
    {
        System.out.println("Adding student in the list");
        Student student1=new Student("sonal",101,35,22);
       // System.out.println(student);
        addStudent(student1);
        Student student2=new Student("ritwik",102,40,15);
        addStudent(student2);
        Student student3=new Student("ridhima",103,60,21);
        addStudent(student3);
        System.out.println();
        System.out.println("To check whether the student is passed");
        isStudentPassed(101);
        isStudentPassed(103);
        isStudentPassed(102);
        System.out.println();
        System.out.println("It will return the name of student : ");
        System.out.println( getStudent(102));
        System.out.println();
        System.out.println("The list of all student");
        System.out.println();
        System.out.println( getAllStudents());

    }
    @Deactivate
    void deactivate()
    {
        System.out.println("deleting the student");
        deleteStudent(102);
        System.out.println(getAllStudents());
    }
}



