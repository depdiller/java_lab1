package employee;

public class Accountant {
    public static void paySalary(Employee employee) {
        System.out.println(employee.getSurname() + ' ' +
                employee.getName() + ',' +
                " you received your month wage: " +
                employee.getRole().getSalary() + 'K');
    }
    //Выплату зарплаты реализовать через вывод в консоль сообщения о выплате

    public static void payPremium(Employee employee) {
        double premium = employee.getRole().getPremium() * employee.getRole().getSalary();
        System.out.println(employee.getSurname() + ' ' +
                employee.getName() + ',' +
                " you received premium: " +
                premium + 'K');
    }
    //Выплату премии реализовать через вывод в
    // консоль сообщения о выплате.
    // Процент премии хранится в enum role
    // (STAFF = 10%, MANAGER = 20%, EXECUTIVE = 30%)
}