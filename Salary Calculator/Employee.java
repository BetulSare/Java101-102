package salary.calculator;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.hireYear = hireYear;
        this.name = name;
        this.workHours = workHours;
        this.salary = salary;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours-40)* 30;
        } else {
            return this.salary;
        }
    }

    public double reiseSalary() {
        if (2021-this.hireYear  > 19) {
            return this.salary * 0.15;
        } else if (2021-this.hireYear > 9) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.05;
        }
    }

    public void ToString() {
        System.out.println("Adı: "+this.name+
                "\nMaaşı: "+this.salary+
                "\nBaşlangıç yılı: "+this.hireYear+
                "\nVergi: "+tax()+
                "\nBonus: "+bonus());
        double salaryIncrease=bonus()+reiseSalary();
        System.out.println("Maaş artışı: "+reiseSalary());
        double totalSalary=this.salary-tax()+bonus()+reiseSalary();
        System.out.println("Toplam maaş: "+totalSalary);

    }
}