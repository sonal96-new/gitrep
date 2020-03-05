package in.ttn.Impl.Student;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import java.util.List;

@Designate(ocd = ClassConfig.class)
@Component(service = StudentService1.class,immediate = true)
public class StudentClassConfig implements StudentService1
{
    @Activate
    ClassConfig classConfig;

    @Activate
    public void activate() {
       // System.out.println(isClassLimitReached(list));
        System.out.println(getPassingMarks());
    }
    public boolean isClassLimitReached(List list)
    {
        if(list.size() < classConfig.Total_Students()) {
            return true;
        }
        return false;
    }
    public float getPassingMarks ()
    {
        return classConfig.Students_PassMarks();
    }


}
