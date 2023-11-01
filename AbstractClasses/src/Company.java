import java.util.*;

public class Company {
    private double income;

    private List<Employee> employees;

    public Company(double income) {
        employees = new ArrayList<>();
        this.income = income;

    }

    void hire(Employee employee) {
        employees.add(employee);
    }

    void hireAll(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    List<Employee> getEmployees() {
        return employees;
    }

    void fire(Employee employee) {
        employees.remove(employee);
    }

    double getIncome() {
        return income;
    }

    List<Employee> getTopSalaryStaff(int count) {
        List<Employee> employeeList = new ArrayList<>(employees);
        employeeList.sort((e1, e2) -> Double.compare(e2.getMonthSalary(), e1.getMonthSalary()));

        List<Employee> employeeTopSalary = new ArrayList<>();
        if (count > employeeList.size()) {
            count = employeeList.size();
        } else if (count <= 0) {
            count = 0;
            System.out.println("Неверно задано количество сотрудников");
        }

        for (int i = 0; i < count; i++) {
            employeeTopSalary.add(employeeList.get(i));
        }
        return employeeTopSalary;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> employeeList = new ArrayList<>(employees);
        employeeList.sort(Comparator.comparingDouble(Employee::getMonthSalary));

        List<Employee> employeeLowSalary = new ArrayList<>();

        if (count > employeeList.size()) {
            count = employeeList.size();
        }
        else if (count <= 0) {
            count = 0;
            System.out.println("Неверно задано количество сотрудников");
        }

        for (int i = 0; i < count; i++) {
            employeeLowSalary.add(employeeList.get(i));
        }
        return employeeLowSalary;
    }
}


