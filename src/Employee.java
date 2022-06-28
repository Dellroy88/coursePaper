public class Employee {
    String staff;
    int department;
    int salaryStaff;
    int id;
    static int counter;

    public Employee(String staff, int department, int salaryStaff) {
        this.staff = staff;
        this.department = department;
        this.salaryStaff = salaryStaff;
        this.id = getCounter();
    }

    public int getCounter() {
        return counter++;
    }

    public String getStuff() {
        return this.staff;
    }


    public int getDepartment() {
        return this.department;
    }

    public int getSalaryStuff() {
        return this.salaryStaff;
    }

    public int getId() {
        return this.id;
    }

    public void setSalary(int new_salary) {
        this.salaryStaff = new_salary;
    }
    public void setStuff(String new_stuff) {
        this.staff = new_stuff;
    }
    public void setDepartment(int new_department) {
        this.department = new_department;
    }

    @Override
    public String toString() {
        return  "Ф.И.О. " + this.staff + " Зарплата сотрудника " + this.salaryStaff + " Номер отдела " + this.department + " ID " + id;
    }
}

