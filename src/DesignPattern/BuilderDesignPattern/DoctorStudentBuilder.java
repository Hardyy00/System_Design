package DesignPattern.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DoctorStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects(){
        List<String> subs=  new ArrayList<>();
        subs.add("Anatomy");
        subs.add("Microbiology");
        this.subjects = subs;
        return this;
    }
}
