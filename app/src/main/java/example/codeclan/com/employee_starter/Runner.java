package example.codeclan.com.employee_starter;

/**
 * Created by user on 22/02/2017.
 */

public class Runner {
    public static void main(String[] args){
        Department department1 = new Department("HR");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("Sales");
        Department department4 = new Department("Finance");
        Department department5 = new Department("Admin");

        department1.save();
        department2.save();
        department3.save();
        department4.save();
        department5.save();

        Employee employee1 = new Employee("Suzie Smith", department1, 45000);
        Employee employee2 = new Employee("Jamie Jones", department2, 25000);
        Employee employee3 = new Employee("John Smith", department1, 25000);
        Employee employee4 = new Employee("Emily Dean", department2, 30000);
        Employee employee5 = new Employee("Ryan Forgie", department3, 30000);
        Employee employee6 = new Employee("Louis Griffiths", department3, 40000);
        Employee employee7 = new Employee("Chris Hales", department4, 40000);
        Employee employee8 = new Employee("Tom Edgely", department4, 60000);
        Employee employee9 = new Employee("Tom Jones", department5, 20000);
        Employee employee10 = new Employee("Tom Jones", department5, 75000);


        employee1.save();
        employee2.save();
        employee3.save();
        employee4.save();
        employee5.save();
        employee6.save();
        employee7.save();
        employee8.save();
        employee9.save();
        employee10.save();


//        department1.setTitle("Sales");
//        department1.update();
//        department2.delete();
//
//        employee1.setName("Ryan Forgie");
//        employee1.setDepartment(department2);
//        employee1.setSalary(40000);
//        employee1.update();
//        employee2.delete();
//
//        Department.all();
//        Employee.all();

        Department.findByTitle("HR");
        Employee.findByName("Ryan Forgie");

    }
}
