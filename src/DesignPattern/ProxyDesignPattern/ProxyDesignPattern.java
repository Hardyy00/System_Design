package DesignPattern.ProxyDesignPattern;

public class ProxyDesignPattern {

    public static void main(String[] args) {



        EmployeeDao empTalbeObj = new EmployeeDaoProxy(new EmployeeDaoConcrete());

        try{
            empTalbeObj.create("ADMIN", new EmployeeDo());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            empTalbeObj.create("USER", new EmployeeDo());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
}
