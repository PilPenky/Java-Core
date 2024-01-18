package HW_Lesson3.Exercise2;

import java.util.Arrays;

import static HW_Lesson3.Exercise2.Supervisor.increaseAllSalary;

/*
Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
*/
public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "developer", "111111111", 1000.0, 25);
        Employee olga = new Employee("Olga", "tester", "2222222222", 150.0, 27);
        Employee sergei = new Employee("Sergei", "designer", "333333333", 200.0, 30);
        Employee natlia = new Employee("Natalia", "analitic", "44444444", 250.0, 35);
        Employee andrey = new Employee("Andrey", "devops", "5555555555", 300.0, 47);
        Employee artur = new Supervisor("Artur", "supervisor", "6666666666", 1500.0, 30, "senior manager");
        Employee olik = new Supervisor("Olik", "supervisor", "7777777777", 1100.0, 32, "second manager");

        Employee[] employees = {ivan, olga, sergei, natlia, andrey, artur, olik};

//        Employee[] employees1 = {new Employee("Ivan", "developer", "111111111", 1000.0, 25),
//                new Employee("Olga", "tester", "2222222222", 150.0, 27),
//                new Employee("Sergei", "designer", "333333333", 200.0, 30),
//                new Employee("Natalia", "analitic", "44444444", 250.0, 35),
//                new Employee("Andrey", "devops", "5555555555", 300.0, 47)};

        System.out.println(Arrays.toString(employees));

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        increaseAllSalary(employees, 100);
        System.out.println(Arrays.toString(employees));
    }

    private static void increaseSalary(Employee[] employees){
        for (Employee employee: employees){
            if (employee.getAge() > 45) {
                employee.setSalary(employee.getSalary() + 5000);
            }
        }
    }

    private static void increaseSalary(Employee[] employees, int age, int amount){
        for (Employee employee: employees){
            if (employee.getAge() > age) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }
}