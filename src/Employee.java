import java.util.Random;

public class Employee {

    private int salary = new Random().nextInt(15000, 150000);
    private int department = new Random().nextInt(1, 6);
    private String name;
    private String surname;
    private String middlename;
    private static int counter = 0;
    private int id;

    {
        id = counter;
        counter++;
    }

    public Employee(String name, String surname, String middlename) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;

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

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + middlename + " Заработная плата: " + salary + " Работник отдела: " + department + " ID:" + id + "\n";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
