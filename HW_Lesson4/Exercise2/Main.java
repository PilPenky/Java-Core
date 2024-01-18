package HW_Lesson4.Exercise2;

import HW_Lesson4.Exercise2.Exceptions.AmountException;
import HW_Lesson4.Exercise2.Exceptions.CustomerException;
import HW_Lesson4.Exercise2.Exceptions.ProductException;

import java.util.ArrayList;

/*
    Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод,
    принимающий массив покупателей, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
*/
public class Main {
    static ArrayList<Customer> customers = new ArrayList<Customer>();
    static ArrayList<Item> items = new ArrayList<Item>();
    static ArrayList<Order> orders = new ArrayList<Order>();
    static ArrayList<Order> draft = new ArrayList<Order>();


    public static void main(String[] args) throws Exception {
        customers.add(new Customer("customer1", 20, 123, Gender.MALE));
        customers.add(new Customer("customer2", 21, 345, Gender.FEMALE));
        customers.add(new Customer("customer3", 30, 147, Gender.MALE));
        customers.add(new Customer("customer4", 35, 258, Gender.FEMALE));
        customers.add(new Customer("customer5", 19, 369, Gender.FEMALE));

        Congratulation.congratulation(customers);

    }
    public static Order placeOrder(Customer customer, Item item, int quantity) throws Exception {
        if (!customers.contains(customer))
            throw new CustomerException("Customer not found");
        if(!items.contains(item))
            throw new ProductException("Item not found");
        if(quantity < 0)
            throw new AmountException("Incorrect amount " + quantity);
        return new Order(customer, item, quantity);
    }
}

