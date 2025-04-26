

public class Main {
    public static void main(String[] args) {
        EmployeeBook firmOfBroom = new EmployeeBook();


        firmOfBroom.createEmployee("Антон", "Антонов", "Антонович");

        firmOfBroom.printAllEmployees();
        System.out.println("Количество сотрудников: " + firmOfBroom.amountOfEmployees());
        System.out.println("Сумма зарплат в фирме: " + firmOfBroom.summOfSalary());
        System.out.println("Средняя зарплата по фирме: " + firmOfBroom.averageSalary());
        firmOfBroom.printEmployeesForId(4);
        firmOfBroom.deleteEmployee(2);

        firmOfBroom.indexOfSalary(10);

        firmOfBroom.printNameOfEmployees(3);

    }
}