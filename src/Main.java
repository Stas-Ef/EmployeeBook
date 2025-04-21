import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int borderSalary = 120000;
        int department = 2;
        int indexSalary = 15;

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
        smallerSalaryNameOfEmployees(employees, borderSalary);
    }

    public static void printAllEmployees(Employee employee[]) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static int amountOfEmployees(Employee employee[]) {
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                j++;
            }
        }
        System.out.println("Количество работников: " + j);
        return j;
    }

    public static int summOfSalary(Employee employee[], int amountOfEmployees) {
        int summ = 0;
        int averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                summ += employee[i].getSalary();
            }
        }
        averageSalary = summ / amountOfEmployees;
        System.out.println("Общая сумма зарплат = " + summ);
        System.out.println("Средняя зарплата = " + averageSalary);
        return summ;
    }

    public static int averageSalary(int summOfSalary, int amountOfEmployees) {
        int averageSalary = 0;
        averageSalary = summOfSalary / amountOfEmployees;
        return averageSalary;
    }

    public static Employee minSalary(Employee employee[]) {
        int minSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() <= minSalary) {
                minSalary = employee[i].getSalary();
                j = i;
            }
        }
        return employee[j];
    }

    public static Employee maxSalary(Employee employee[]) {
        int maxSalary = employee[0].getSalary();
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= maxSalary) {
                maxSalary = employee[i].getSalary();
                j = i;
            }
        }
        return employee[j];
    }

    public static void nameOfEmployees(Employee employee[]) {
        System.out.println("ФИО сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename());
            }
        }
    }

    public static void indexOfSalary(Employee employee[], int indexSalary) {
        int newSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                newSalary = employee[i].getSalary() + (employee[i].getSalary() * indexSalary) / 100;
                employee[i].setSalary(newSalary);
                System.out.println("Новая зарплата сотрудника " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename() + " cоставляет: " + employee[i].getSalary());
            }
        }
    }

    public static int departmentAmountOfEmployees(Employee employee[], int department) {
        int j = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                j++;
            }
        }
        //System.out.println("Количество работников отдела " + department + ": " + j);
        return j;
    }

    public static int departmentMinSalary(Employee employee[], int department) {
        int minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() <= minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        // System.out.println("Минимальная зарплата работника отдела " + department + ", у сотрудника: " + employee[j].getSurname() + " " + employee[j].getName() + " " + employee[j].getMiddlename() + " ID: " + employee[j].getId() + " и составляет: " + employee[j].getSalary());
        return minSalary;
    }

    public static int departmentMaxSalary(Employee employee[], int department) {
        int maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() >= maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        //System.out.println("Макcимальная зарплата работника отдела " + department + ", у сотрудника: " + employee[j].getSurname() + " " + employee[j].getName() + " " + employee[j].getMiddlename() + " ID: " + employee[j].getId() + " и составляет: " + employee[j].getSalary());
        return maxSalary;
    }

    public static int departmentSalarySumm(Employee employee[], int department, int departmentAmountOfEmployees) {
        int summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    public static int departmentAverageSalary(int departmentAmountOfEmployees, int departmentSalarySumm) {
        int averageSumm = 0;
        averageSumm = departmentSalarySumm / departmentAmountOfEmployees;
        return averageSumm;
    }


    public static void departmentIndexOfSalary(Employee employee[], int department, int indexSalary) {
        int newSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                newSalary = employee[i].getSalary() + (employee[i].getSalary() * indexSalary) / 100;
                employee[i].setSalary(newSalary);
                System.out.println("Новая зарплата сотрудника " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename() + " cоставляет: " + employee[i].getSalary());
            }
        }
    }


    public static void departmentNameOfEmployees(Employee employee[], int department) {
        System.out.println("ФИО сотрудников отдела " + department + ": ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                System.out.println("ID: " + employee[i].getId() + " " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename() + " " + employee[i].getSalary());
            }
        }
    }

    public static void biggerSalaryNameOfEmployees(Employee employee[], int borderSalary) {
        System.out.println("Сотруники зарплата которых больше " + borderSalary + ": ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= borderSalary) {
                System.out.println("ID: " + employee[i].getId() + " " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename() + " " + employee[i].getSalary());
            }
        }
    }

    public static void smallerSalaryNameOfEmployees(Employee employee[], int borderSalary) {
        System.out.println("Сотруники зарплата которых меньше " + borderSalary + ": ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() <= borderSalary) {
                System.out.println("ID: " + employee[i].getId() + " " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename() + " " + employee[i].getSalary());
            }
        }
    }
}


