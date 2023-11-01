import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company(10_000_001);

        for(int i = 0; i <= 180; i++) {
            company1.hire(new Operator(company1));
        }

        for(int i = 0; i <= 80; i++) {
            company1.hire(new Manager(company1));
        }

        for(int i = 0; i <= 10; i++) {
            company1.hire(new TopManager(company1));
        }

        List<Employee> topSalaries = company1.getTopSalaryStaff(15);
        List<Employee> lowestSalaries = company1.getLowestSalaryStaff(30);

        if(topSalaries.size() > 0){
            System.out.println("Список самых высоких зарплат: ");
            for(Employee employee : topSalaries) {
                System.out.println(Math.round(employee.getMonthSalary()) + " руб.");
            }
        }

        if(lowestSalaries.size() > 0) {
            System.out.println("Список самых низких зарплат: ");
            for(Employee employee : lowestSalaries) {
                System.out.println(Math.round(employee.getMonthSalary()) + " руб.");
            }
        }

        int totalEmployees = company1.getEmployees().size();
        int countEmployeeToFire = totalEmployees / 2;

        List<Employee> employees = company1.getEmployees();
        Collections.shuffle(employees);

        for(int i = 0; i <= countEmployeeToFire; i++) {
            company1.fire(employees.get(i));
        }

        topSalaries = company1.getTopSalaryStaff(15);
        lowestSalaries = company1.getLowestSalaryStaff(30);

        if(topSalaries.size() > 0) {
            System.out.println("Список самых высоких зарплат: ");
            for(Employee employee : topSalaries) {
                System.out.println(Math.round(employee.getMonthSalary()) + " руб.");
            }
        }

        if(lowestSalaries.size() > 0){
            System.out.println("Список самых низких зарплат: ");
            for(Employee employee : lowestSalaries) {
                System.out.println(Math.round(employee.getMonthSalary()) + " руб.");
            }
        }
    }
}
