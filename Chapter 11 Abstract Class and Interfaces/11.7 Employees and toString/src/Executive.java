public class Executive extends Manager{

    public Executive() {
    }

    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    public String toString(){//overriding the toString() method
        return "Executive:\nname = "+name+"\nsalary = "+salary+"\ndepartment = "+department +"\n";
    }
}