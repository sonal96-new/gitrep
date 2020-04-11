package com.bootcamp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

@Model(adaptables = Resource.class,defaultInjectionStrategy =DefaultInjectionStrategy.OPTIONAL)
public class MyDetails {
    @Inject
    private  String firstName;

    @Inject
    private  String lastName;

    @Inject
    private Date dateOfBirth;

    @Inject
    private  String gender;

    @Inject
    private  String maritalStatus;

    private String fullName;

    private  int age;

    private String honorific;

    @PostConstruct
    protected void init() {

        fullName=firstName + " " + lastName;

        if (("male").equals(gender))
        {
            honorific="Mr";
        }
        else if (("female").equals(gender) && ("single").equals(maritalStatus))
        {
            honorific="Ms";
        }
        else if (("female").equals(gender) && ("married").equals(maritalStatus))
        {
            honorific="Mrs";
        }

            age = calculateAge();
        }



    private int calculateAge()
    {
        if(null != dateOfBirth){
            Calendar c = Calendar.getInstance();
            c.setTime(dateOfBirth);
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH) + 1;
            int date = c.get(Calendar.DATE);
            LocalDate l1 = LocalDate.of(year, month, date);
            LocalDate now1 = LocalDate.now();
            Period diff= Period.between(l1, now1);
            return diff.getYears();
        }
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getFullName() {
        return fullName;
    }

    public String getHonorific() {
        return honorific;
    }
    public int getAge() {
        return age;
    }
}
