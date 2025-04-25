
import java.util.Random;

public class Employee {

    private int salary;
    private int department;
    private String name;
    private String surname;
    private String middlename;
    private static int counter = 0;
    private int id;

    public void counterId() {
        id = counter;
        ++counter;

    }

    public Employee(String name, String surname, String middlename) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        counterId();
        this.salary = new Random().nextInt(15000, 150000);
        this.department = new Random().nextInt(1, 6);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return " ID:" + id + " " + surname + " " + name + " " + middlename + " Заработная плата: " + salary + " Работник отдела: " + department + "\n";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode() + middlename.hashCode() + salary + department + id;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return name.equals(employee.name) && surname.equals(employee.surname) && middlename.equals(employee.middlename) && salary == employee.salary && department == employee.department;
    }
}
