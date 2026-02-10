public class SalaryEncap {
    
    private int salary;
    private String name;

    public void setSalary(int salary) {
        if(salary>=10000 && salary<=100000) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary is not in range");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        SalaryEncap s = new SalaryEncap();

        s.setSalary(100);
        s.setName("Kaushik");

        System.out.println(s.getSalary());
        System.out.println(s.getName());
    }
}
