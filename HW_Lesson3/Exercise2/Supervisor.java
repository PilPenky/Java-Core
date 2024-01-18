package HW_Lesson3.Exercise2;

public class Supervisor extends Employee {

    String rang;
    public Supervisor(String name, String position, String phone, double salary, int age, String rang) {
        super(name, position, phone, salary, age);
        this.rang = rang;
    }

    static void increaseAllSalary(Employee[] employees, int amount){
        for (Employee employee: employees){
            if (!(employee instanceof Supervisor)) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }
}
