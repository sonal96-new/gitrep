package in.ttn.Impl.Student;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Student Configuration",description = "This is the description that has two configuration mandatory for student")
public @interface ClassConfig {


        @AttributeDefinition(name = "No. of Students",type = AttributeType.INTEGER,description = "some description")
        int Total_Students() default 5;
        @AttributeDefinition(name = " Students Marks",type = AttributeType.INTEGER)
        int Students_PassMarks() default 40;


}
