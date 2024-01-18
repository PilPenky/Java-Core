package HW_Lesson4.Exercise1;

import HW_Lesson4.Exercise1.Customer;
import HW_Lesson4.Exercise1.Exceptions.AmountException;
import HW_Lesson4.Exercise1.Exceptions.CustomerException;
import HW_Lesson4.Exercise1.Exceptions.ProductException;
import HW_Lesson4.Exercise1.Item;
import HW_Lesson4.Exercise1.Order;

import java.util.ArrayList;

/*
    В класс покупателя добавить перечисление с гендерами, внедрить Lombok https://habr.com/ru/articles/345520/
*/
public class Main {
    static ArrayList<Customer> customers = new ArrayList<Customer>();
    static ArrayList<Item> items = new ArrayList<Item>();
    static ArrayList<Order> orders = new ArrayList<Order>();
    static ArrayList<Order> draft = new ArrayList<Order>();


    public static void main(String[] args) throws Exception {
        customers.add(new Customer("customer1", 20, 123, Gender.MALE));
        customers.add(new Customer("customer2", 21, 345, Gender.FEMALE));
        items.add(new Item("item1", 10));
        items.add(new Item("item2", 20));
        items.add(new Item("item3", 30));
        items.add(new Item("item4", 40));
        items.add(new Item("item5", 50));


        try {
            orders.add(placeOrder(customers.get(0),items.get(0), 5));
            orders.add(placeOrder(customers.get(1),items.get(1), 5));
            orders.add(placeOrder(customers.get(0),items.get(2), 5));
            orders.add(placeOrder(new Customer("new cust", 50, 456, Gender.FEMALE),items.get(0), 5));
            orders.add(placeOrder(customers.get(0),new Item("new item", 15), 5));
            orders.add(placeOrder(customers.get(0),items.get(2), -5));
        }
        catch (CustomerException e){
            System.out.println(e.getMessage());
        }
        catch (ProductException e){
            System.out.println(e.getMessage());
        }
        catch (AmountException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Orders length: " + orders.size());
        }

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

