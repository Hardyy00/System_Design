package DesignPattern.BuilderDesignPattern;

public class Client {

    public static void main(String[] args){

        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorObj2 = new Director(new DoctorStudentBuilder());

        Student enginneringStudent = directorObj1.createStudent();
        Student mbbsStudent = directorObj2.createStudent();

        System.out.println(enginneringStudent);
        System.out.println(mbbsStudent);
    }
}
