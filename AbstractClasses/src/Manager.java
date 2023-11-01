public class Manager implements Employee {
    private static final double BONUS = 0.05;
    private double minIncome = 115_000;
    private double maxIncome = 140_000;
    private double managersIncome = (Math.random() * (maxIncome - minIncome)) + minIncome;

    private double salary;
    private double fixSalary;
    private Company company;

    public Manager(Company company) {
        fixSalary = Math.round(Math.random() * (80_000 - 50_000) + 50_000);
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        salary = fixSalary + managersIncome * BONUS;
        return salary;
    }
}
