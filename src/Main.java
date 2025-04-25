import java.util.Arrays;

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






        /*
        System.out.println(Arrays.toString());
        System.out.println("employees[1].getSurname() = " + employees[1].getSurname());
        employees[4].setDepartment(1);
        System.out.println("Измененый отдел работника: " + employees[4].getDepartment());
        System.out.println("employees[2].equals(employees[3]) = " + employees[2].equals(employees[3]));
        System.out.println("employees[3].hashCode(employees[5]) = " + employees[3].hashCode());
        System.out.println("=========================================================");


        EmployeeBook.printAllEmployees();
        summOfSalary(employees, amountOfEmployees(employees));
        averageSalary(summOfSalary(employees, amountOfEmployees(employees)), amountOfEmployees(employees));
        minSalary(employees);
        maxSalary(employees);
        amountOfEmployees(employees);
        nameOfEmployees(employees);
        System.out.println("=================ПОВЫШЕННАЯ СЛОЖНОСТЬ========================");
        indexOfSalary(employees, indexSalary);
        departmentMinSalary(employees, department);
        departmentMaxSalary(employees, department);
        departmentSalarySumm(employees, department, departmentAmountOfEmployees(employees, department));
        departmentAverageSalary(departmentAmountOfEmployees(employees, department), departmentSalarySumm(employees, department, departmentAmountOfEmployees(employees, department)));
        departmentIndexOfSalary(employees, department, indexSalary);
        departmentNameOfEmployees(employees, department);
        biggerSalaryNameOfEmployees(employees, borderSalary);
        smallerSalaryNameOfEmployees(employees, borderSalary);*/


    }
}