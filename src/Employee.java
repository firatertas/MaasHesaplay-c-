public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 3 / 100;
        }
        return this.salary;
    }

    public double bonus() {

        if (this.workHours > 40) {
            double bonus = 30 * (this.workHours - 40);
            return bonus;
        }
        return this.salary;
    }

    public double raiseSalary() {
        int year = 2021 - this.hireYear;
        System.out.println(year);
        if (year < 10) {
            double salary = this.salary * 5 / 100;
            return salary;
        }
        if (year > 9 && year < 20) {
            double salary = this.salary * 0.1;
            return salary;
        }
        if (year > 19) {
            double salary = this.salary * 0.15;
           return salary;
        }
        return this.salary;
    }

    public String toString() {

        return  "Adı : "+this.name+"\n"+"Maaş : "+this.salary+"\n"+
                "Çalışma Saati : "+this.workHours+"\n"+"Başlangıç Yılı : "+this.hireYear+
                "\n"+"Vwergi : "+this.tax()+"\n"+"Bonus : "+this.bonus()+"\n"+"Maaş Artışı : "+
                this.raiseSalary()+"\n"+ "Vergi ve Bonuslar ile birlikte maaş : "+
                (((this.salary+this.bonus())-this.tax()))+"\n"+"Toplam Maaş : "+
                ((this.bonus()-this.tax())+this.salary+this.raiseSalary());


        }

}
