import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванов", "Иванович");
        employees[1] = new Employee("Петр", "Петров", "Петрович");
        employees[2] = new Employee("Александр", "Александров", "Александрович");
        employees[3] = new Employee("Семен", "Семенов", "Александрович");
        employees[4] = new Employee("Антон", "Семенов", "Семенович");
        employees[5] = new Employee("Игорь", "Семенов", "Семенович");
        employees[9] = new Employee("Дмитрий", "Семенов", "Семенович");

        System.out.println(Arrays.toString(employees));
        System.out.println("employees[1].getSurname() = " + employees[1].getSurname());
        employees[4].setDepartment(1);
        System.out.println("Измененый отдел работника: " + employees[4].getDepartment());
        System.out.println("employees[2].equals(employees[3]) = " + employees[2].equals(employees[3]));
        System.out.println("employees[3].hashCode(employees[5]) = " + employees[3].hashCode());
        System.out.println("=========================================================");
        printAllEmployees(employees);
        summOfSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        amountOfEmployees(employees);
        nameOfEmployees(employees);
    }

    public static void printAllEmployees(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static void summOfSalary(Employee employee[]) {
        int summ = 0;
        int j = 0;
        int averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                summ += employee[i].getSalary();
                j++;
            }
            averageSalary = summ / j;
        }
        System.out.println("Общая сумма зарплат = " + summ);
        System.out.println("Средняя зарплата = " + averageSalary);
    }

    public static void minSalary(Employee employee[]) {
        int minSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() <= minSalary) {
                minSalary = employee[i].getSalary();
                j = i;
            }
        }
        System.out.println("Минимальная зарплата у работника: " + employee[j].getSurname() + " " + employee[j].getName() + " " + employee[j].getMiddlename() + " ID: " + employee[j].getId() + " и составляет: " + employee[j].getSalary());
    }

    public static void maxSalary(Employee employee[]) {
        int maxSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= maxSalary) {
                maxSalary = employee[i].getSalary();
                j = i;
            }
        }
        System.out.println("Максимальная зарплата у работника: " + employee[j].getSurname() + " " + employee[j].getName() + " " + employee[j].getMiddlename() + " ID: " + employee[j].getId() + " и составляет: " + employee[j].getSalary());
    }

    public static void amountOfEmployees(Employee employee[]) {
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                j++;
            }
        }
        System.out.println("Количество работников: " + j);
    }

    public static void nameOfEmployees(Employee employee[]) {
        System.out.println("ФИО сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename());
            }
        }

    }
}