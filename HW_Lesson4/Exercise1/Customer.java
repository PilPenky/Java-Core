package HW_Lesson4.Exercise1;

public class Customer {
    private String name;
    private int age;
    private int phone;
    private Enum gender;

    public Customer(String name, int age, int phone, Enum gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }
}
