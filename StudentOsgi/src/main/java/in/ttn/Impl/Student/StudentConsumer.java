package in.ttn.Impl.Student;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


public class StudentConsumer
{
    @Reference
    StudentService2 studentService2;
}
