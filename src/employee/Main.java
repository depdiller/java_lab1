package employee;
import com.sun.security.jgss.GSSUtil;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> companyList = Employee.createShortList();

        // lab predicates
        Predicate<Employee> women = e -> e.getGender().equals(Employee.Gender.FEMALE);
        Predicate<Employee> dept = e -> e.getDept().equals("General Management");
        Predicate<Employee> deptAndAge = e -> e.getDept().equals("General Management") && e.getAge() > 30;
        Predicate<Employee> managers = e -> e.getRole().equals(Role.MANAGER);
        Predicate<Employee> staff = e -> e.getRole().equals(Role.STAFF);

        // homework interfaces
        Consumer<Employee> printEmployee = System.out::println;
        Function<List<Employee>, Employee> youngestInTeam = eList ->
            eList.stream()
                    .min(Comparator.comparing(Employee::getAge))
                    .orElseThrow();
        Supplier<Employee> employeeIgor = () -> new Employee.Builder()
                .setGivenName("Igor")
                .setSurName("Ivanov")
                .setAge(40)
                .setGender(Employee.Gender.MALE)
                .setRole(Role.MANAGER)
                .setDept("General Management")
                .setPhone("5489211")
                .setAddress("Rbs Street 31")
                .setCity("Moscow")
                .setCode("30")
                .build();
        BiPredicate<Employee, Role> checkRole = (e, role) -> e.getRole().equals(role);

        // check homework interfaces
        printEmployee.accept(companyList.get(0));
        Employee young = youngestInTeam.apply(companyList);
        System.out.println(young);
        System.out.println(employeeIgor.get());
        System.out.println(checkRole.test(companyList.get(1), Role.MANAGER));

        // women premium
        System.out.println("=== women premium ===");
        companyList.stream()
                .filter(women)
                .forEach(Accountant::payPremium);
        System.out.println();

        // particular dept wage
        System.out.println("=== particular dept wage ===");
        companyList.stream()
                .filter(dept)
                .forEach(Accountant::paySalary);
        System.out.println();

        // particular dept and age > 30 premium
        System.out.println("=== particular dept and age > 30 premium ===");
        companyList.stream()
                .filter(deptAndAge)
                .forEach(Accountant::payPremium);
        System.out.println();

        // managers wage
        System.out.println("=== managers wage ===");
        companyList.stream()
                .filter(managers)
                .forEach(Accountant::paySalary);
        System.out.println();

        // staff premium
        System.out.println("=== staff premium ===");
        companyList.stream()
                .filter(staff)
                .forEach(Accountant::payPremium);
        System.out.println();
    }
}
