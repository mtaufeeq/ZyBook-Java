public class Main {
    public static void main(String[] args) {
        Employee one = new Employee("Bob Smith",20000);
        Manager two = new Manager("Sue Jones", 40000, "Human Resources");
        Executive three = new Executive("Carl Turner",60000,"Operations");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}