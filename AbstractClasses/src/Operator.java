public class Operator implements Employee {

    private double salary;
    private Company company;

    public Operator(Company company) {
        salary = Math.random() * (50_000 - 30_000) + 30_000;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}
