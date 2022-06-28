public class Main {
    public static void allStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void minSalaryStaff(Employee[] employees) {
        if (employees.length > 0) {
            Employee minSalary = employees[0];
            for (Employee employee : employees) {
                if (minSalary.getSalaryStuff() > employee.getSalaryStuff())
                    minSalary = employee;
            }
            System.out.println("Сотрудник с минимальной зарплатой " + minSalary.getStuff() + " зарплата " + minSalary.getSalaryStuff() + " ID " + minSalary.getId());
        } else
                System.out.println("-------");
                }

    public static void maxSalaryStaff(Employee[] employees) {
        if (employees.length > 0) {
            Employee maxSalary = employees[0];
            for (Employee employee : employees) {
                if (maxSalary.getSalaryStuff() < employee.getSalaryStuff())
                    maxSalary = employee;
            }
            System.out.println("Сотрудник с максимальной зарплатой " + maxSalary.getStuff() + " зарплата " + maxSalary.getSalaryStuff() + " ID " + maxSalary.getId());
        } else
            System.out.println("-------");
    }

    public static int monthlyExpenses(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStuff();
        }
        System.out.println("Сумма затрат за месяц " + sum);
        return sum;
    }

    public static void averageSalaryValue(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStuff();
        }
        int average = sum / employees.length;
        System.out.println("Среднее значение затрат в месяц " + average);
    }

    public static void allNameStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Cотрудник: " + employee.getStuff());

        }
    }
    public static void main(String[] args) {

        // 1. Создать класс Employee, который содержит информацию о Ф. И. О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
        // 2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
        // 3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        //  4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
        //  5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
        //  6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
        //  7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
        //   8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
        //   1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        //   2. Посчитать сумму затрат на зарплаты в месяц.
        // 3. Найти сотрудника с минимальной зарплатой.
        // 4. Найти сотрудника с максимальной зарплатой.
        // 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        // 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).


        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich", 1, 65684);
        employee[1] = new Employee("Zaycev Nikolay Vladimirovich", 2, 86451);
        employee[2] = new Employee("Emilyanov Sergey Sergeevich", 3, 123552);
        employee[3] = new Employee("Tihonov Aleksander Vladimirovich", 4, 45210);
        employee[4] = new Employee("Eryomenko Kirill Alekseevich", 5, 100656);
        employee[5] = new Employee("Shin Vladislav Valeryevich", 3, 190000);
        employee[6] = new Employee("Kim Inna Vladimirovna", 2, 36854);
        employee[7] = new Employee("Zimin Artyom Andreevich", 1, 46874);
        employee[8] = new Employee("Klepikova Elena Kirillovna", 4, 96451);
        employee[9] = new Employee("Muhin Vladimir Egorovich", 1, 210000);

        allStaff(employee);
        minSalaryStaff(employee);
        maxSalaryStaff(employee);
        monthlyExpenses(employee);
        averageSalaryValue(employee);
        allNameStaff(employee);
    }

}