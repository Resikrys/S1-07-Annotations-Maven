package s1_07_annotations_lvl1;

@SuppressWarnings("deprecated")
public class PresentialWorker extends Worker {
    private static double gasoline = 50.0;

    public PresentialWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double salaryCalculator(int workedHours) {
        return workedHours * hourPrice + gasoline;
    }

    @Deprecated
    public void officeWork() {
        System.out.println(name + " works from the office.");
    }
}
