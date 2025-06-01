package s1_07_annotations_lvl1;

public class Worker {
    protected String name;
    protected String surname;
    protected double hourPrice;

    public Worker(String name, String surname, double hourPrice) {
        this.name = name;
        this.surname = surname;
        this.hourPrice = hourPrice;
    }

    public double salaryCalculator(int workedHours) {
        return workedHours * hourPrice;
    }
}
