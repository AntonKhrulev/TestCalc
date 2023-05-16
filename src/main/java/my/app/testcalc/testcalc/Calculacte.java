package my.app.testcalc.testcalc;

public class Calculacte {
    private String salary;
    private String vacation;

    public Calculacte(String a, String b) {
        this.salary = a;
        this.vacation = b;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getVacation() {
        return vacation;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    public String getResult() {
        Double salary = null, vacation = null;
        try {
            salary = Double.parseDouble(this.salary);
            vacation = Double.parseDouble(this.vacation);
        } catch (Exception e) {
            return "Error";
        }
        return Double.toString(salary / 22 * vacation);
    }

}
