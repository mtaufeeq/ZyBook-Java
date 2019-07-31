public class Manager extends Employee {
    String department;

    public Manager() {
    }

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){//overriding the toString() method
        return "Manager:\nname = "+name+"\nsalary = "+salary+"\ndepartment = "+department +"\n";
    }

}

