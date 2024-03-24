public class Employee {
    private int salary;
    private int hour;

    public Employee(int salary,int hour){
        setSalary(salary);
        setHour(hour);
    }
    public Employee(int salary){
        setSalary(salary);
        setHour(0);
    }
    private int getHour() {
        return hour;
    }
    private void setHour(int hour) {
        this.hour = hour;
    }

    private void setSalary(int salary){
        this.salary = salary;
    }
    private int getSalary(){
        return salary;
    }

    public int calculate(int extrahr){
        return salary+(hour+extrahr);
    }
    public int calculate(){
        return salary+hour;
    }
}
