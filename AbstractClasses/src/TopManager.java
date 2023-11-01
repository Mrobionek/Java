public class TopManager implements Employee {
    private static final double BONUS = 1.5;
    private static final double COMPANY_INCOME_FOR_BONUS = 10_000_000;

    private double salary;
    private double fixSalary;
    private Company company;

    public TopManager(Company company) {
        fixSalary = Math.random() * (150_000 - 80_000) + 80_000;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if(company.getIncome() > COMPANY_INCOME_FOR_BONUS) {
            salary = fixSalary * BONUS;
        }
        return salary;
    }
}
