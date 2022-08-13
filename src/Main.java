import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Employee1", 20, 100000);
        Employee employee2 = new Employee("Employee2", 25, 150000);
        Employee employee3 = new Employee("Employee3", 30, 200000);
        Employee employee4 = new Employee("Employee4", 35, 250000);
        Employee employee5 = new Employee("Employee5", 18, 80000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        Company company = new Company("Company", employees);
        System.out.println(company);

        System.out.println("checkEmployeeByName method: " + checkEmployeeByName(company, "Employee1"));

        System.out.println("countEmployeeByAge: " + countEmployeeByAge(company, 25));

        System.out.println("getAverageSalary: " + getAverageSalary(company));

        System.out.print("findEmployeeBySalary: ");
        findEmployeeBySalary(company, 200000);

        System.out.println("\ngetMaxSalary: " + getMaxSalary(company));

    }

    public static boolean checkEmployeeByName(Company company, String name) {
        List<Employee> employees = company.getEmployees();
        for (Employee e : employees) {
            if(e.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static int countEmployeeByAge(Company company, int age) {
        int count = 0;
        List<Employee> employees = company.getEmployees();
        for (Employee e : employees) {
            if(e.getAge() >= age) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageSalary(Company company) {
        double totalSalary = 0;
        List<Employee> employees = company.getEmployees();
        for (Employee e : employees) {
            totalSalary += e.getSalary();
        }
        return totalSalary / employees.size();
    }

    public static void findEmployeeBySalary(Company company, int salary) {
        List<Employee> employees = company.getEmployees();
        for (Employee e : employees) {
            if(e.getSalary() >= salary) {
                System.out.print(e.getName() + " ");
            }
        }
    }

    public static int getMaxSalary(Company company) {
        List<Employee> employees = company.getEmployees();
        int maxSalary = 0;
        for (Employee e : employees) {
            maxSalary = (int) Math.max(maxSalary, e.getSalary());
        }
        return maxSalary;
    }
}

