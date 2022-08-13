import java.util.ArrayList;
import java.util.List;

public class Company {

    String companyName;
    List<Employee> employees;

    public Company(String companyName, List<Employee> employees) {
        this.companyName = companyName;
        this.employees = (ArrayList<Employee>) employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }

}