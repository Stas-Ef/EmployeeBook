

public class EmployeeBook {
    private final Employee[] listOfEmployees = new Employee[10];

    public EmployeeBook() {
        this.listOfEmployees[0] = new Employee("Иван", "Иванов", "Иванович");
        this.listOfEmployees[1] = new Employee("Петр", "Петров", "Петрович");
        this.listOfEmployees[2] = new Employee("Александр", "Александров", "Александрович");
        this.listOfEmployees[3] = new Employee("Семен", "Семенов", "Александрович");
        this.listOfEmployees[4] = new Employee("Антон", "Семенов", "Семенович");
        this.listOfEmployees[5] = new Employee("Игорь", "Семенов", "Семенович");
        this.listOfEmployees[9] = new Employee("Дмитрий", "Семенов", "Семенович");
    }

    public boolean createEmployee(String name, String surname, String middlename) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] == null) {
                listOfEmployees[i] = new Employee(name, surname, middlename);
                System.out.println("ADD = " + listOfEmployees[i].toString());
                return true;
            }
        }
        return false;
    }


    public void printAllEmployees() {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i] != null) {
                System.out.println(listOfEmployees[i].toString());
            }
        }
    }

    public boolean printEmployeesForId(int id) {
        for (Employee e : listOfEmployees) {
            if (e.getId() == id) {
                System.out.println(e.toString());
                break;
            }
        }
        return true;
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getId() == id) {
                listOfEmployees[i] = null;
                return true;
            }
        }
        return false;
    }

    public int amountOfEmployees() {
        int j = 0;
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null) {
                j++;
            }
        }
        return j;
    }

    public int summOfSalary() {
        int summ = 0;
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null) {
                summ += this.listOfEmployees[i].getSalary();
            }
        }
        return summ;
    }

    public int averageSalary() {
        int averageSalary = 0;
        averageSalary = this.summOfSalary() / this.amountOfEmployees();
        return averageSalary;
    }

    public Employee minSalary() {
        Employee minSalary = this.listOfEmployees[0];
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getSalary() <= minSalary.getSalary()) {
                minSalary = this.listOfEmployees[i];
            }
        }
        return minSalary;
    }

    public Employee maxSalary() {
        Employee maxSalary = this.listOfEmployees[0];
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getSalary() >= maxSalary.getSalary()) {
                maxSalary = this.listOfEmployees[i];
            }
        }
        return maxSalary;
    }

    public void nameOfEmployees() {
        System.out.println("ФИО сотрудников: ");
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null) {
                System.out.println(this.listOfEmployees[i].getSurname() + " " + this.listOfEmployees[i].getName() + " " + this.listOfEmployees[i].getMiddlename());
            }
        }
    }

    public void indexOfSalary(int indexSalary) {
        int newSalary = 0;
        int department = 0;
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null) {
                newSalary = this.listOfEmployees[i].getSalary() + (this.listOfEmployees[i].getSalary() * indexSalary) / 100;
                this.listOfEmployees[i].setSalary(newSalary);
                System.out.println("Новая зарплата сотрудников:  \n");
                printNameOfEmployees(department);

            }
        }
    }

    public int departmentAmountOfEmployees(int department) {
        int j = 0;
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department) {
                j++;
            }
        }
        return j;
    }

    public Employee departmentMinSalary(int department) {
        Employee minSalary = this.listOfEmployees[0];
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department && this.listOfEmployees[i].getSalary() <= minSalary.getSalary()) {
                minSalary = this.listOfEmployees[i];
            }
        }
        return minSalary;
    }

    public Employee departmentMaxSalary(int department) {
        Employee maxSalary = this.listOfEmployees[0];
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department && this.listOfEmployees[i].getSalary() >= maxSalary.getSalary()) {
                maxSalary = this.listOfEmployees[i];
            }
        }
        return maxSalary;
    }

    public int departmentSalarySumm(int department) {
        int summ = 0;
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department) {
                summ += this.listOfEmployees[i].getSalary();
            }
        }
        return summ;
    }

    public int departmentAverageSalary(int department) {
        int averageSumm = 0;
        averageSumm = this.departmentSalarySumm(department) / this.departmentAmountOfEmployees(department);
        return averageSumm;
    }

    public void departmentIndexOfSalary(int department, int indexSalary) {
        int newSalary = 0;
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department) {
                newSalary = this.listOfEmployees[i].getSalary() + (this.listOfEmployees[i].getSalary() * indexSalary) / 100;
                this.listOfEmployees[i].setSalary(newSalary);
                System.out.println("Новая зарплата сотрудников:  \n");
                printNameOfEmployees(department);
            }
        }
    }

    public void printNameOfEmployees(int department) {
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && department == 0) {
                System.out.println("ID: " + this.listOfEmployees[i].getId() + " " + this.listOfEmployees[i].getSurname() + " " + this.listOfEmployees[i].getName() + " " + this.listOfEmployees[i].getMiddlename() + " " + this.listOfEmployees[i].getSalary());
            } else if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department) {
                System.out.println("ID: " + this.listOfEmployees[i].getId() + " " + this.listOfEmployees[i].getSurname() + " " + this.listOfEmployees[i].getName() + " " + this.listOfEmployees[i].getMiddlename() + " " + this.listOfEmployees[i].getSalary());

            }
        }
    }


    public void departmentNameOfEmployees(int department) {
        System.out.println("ФИО сотрудников отдела " + department + ": ");
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getDepartment() == department) {
                printNameOfEmployees(department);
            }
        }
    }

    public void biggerSalaryNameOfEmployees(int borderSalary, int department) {
        System.out.println("Сотруники зарплата которых больше " + borderSalary + ": ");
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getSalary() >= borderSalary) {
                printNameOfEmployees(department);
            }
        }
    }

    public void smallerSalaryNameOfEmployees(int borderSalary, int department) {
        System.out.println("Сотруники зарплата которых меньше " + borderSalary + ": ");
        for (int i = 0; i < this.listOfEmployees.length; i++) {
            if (this.listOfEmployees[i] != null && this.listOfEmployees[i].getSalary() <= borderSalary) {
                printNameOfEmployees(department);
            }
        }
    }
}
