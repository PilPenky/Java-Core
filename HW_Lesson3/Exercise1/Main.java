package HW_Lesson3.Exercise1;

import java.util.Arrays;

/*
Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
представленные в виде трёх чисел ГГГГ-ММ-ДД, без использования условного оператора.
*/
public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "developer", "111111111", 1000.0, 25);
        Employee olga = new Employee("Olga", "tester", "2222222222", 150.0, 27);
        Employee sergei = new Employee("Sergei", "designer", "333333333", 200.0, 30);
        Employee natlia = new Employee("Natalia", "analitic", "44444444", 250.0, 35);
        Employee andrey = new Employee("Andrey", "devops", "5555555555", 300.0, 47);

        Employee[] employees = {ivan, olga, sergei, natlia, andrey};

//        Employee[] employees1 = {new Employee("Ivan", "developer", "111111111", 1000.0, 25),
//                new Employee("Olga", "tester", "2222222222", 150.0, 27),
//                new Employee("Sergei", "designer", "333333333", 200.0, 30),
//                new Employee("Natalia", "analitic", "44444444", 250.0, 35),
//                new Employee("Andrey", "devops", "5555555555", 300.0, 47)};

//        System.out.println(Arrays.toString(employees));
//        increaseSalary(employees);
//
//        System.out.println(Arrays.toString(employees));
//
//        increaseSalary(employees, 45, 5000);
//        System.out.println(Arrays.toString(employees));

        comparatorPrint();

            }

    public static void comparatorPrint(){
        int firstYear = 2023;
        int firstMonth = 01;
        int firstDay = 14;
        int secondYear = 2023;
        int secondMonth = 01;
        int secondDay = 15;

        long numComparator = Employee.comparator(firstYear, firstMonth, firstDay, secondYear, secondMonth, secondDay);

        if(numComparator < 0){
            System.out.println("Вторая дата больше, чем первая");
        }
        if(numComparator == 0){
            System.out.println("Даты равны");
        }
        if(numComparator > 0){
            System.out.println("Первая дата больше, чем вторая");
        }
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