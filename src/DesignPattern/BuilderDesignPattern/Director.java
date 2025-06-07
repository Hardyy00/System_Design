package DesignPattern.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder ){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof DoctorStudentBuilder){
            return createMBBStudent();
        }

        return null;
    }

    private Student createEngineeringStudent(){

        return studentBuilder.setRollNumber(1).setAge(22).setName("Hardik").setSubjects().build();
    }

    private Student createMBBStudent(){
        return studentBuilder.setRollNumber(1).setAge(22).setName("Hardik Gaur").setFatherName("Ajay Gaur").setMotherName("Neeraj Gaur").setSubjects().build();
    }
}
