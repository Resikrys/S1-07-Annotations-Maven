package s1_07_annotations_lvl1;

public class OnlineWorker extends Worker {
    private static final double INTERNET_TAX = 20.0;

    public OnlineWorker(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double salaryCalculator(int workedHours) {
        return workedHours * hourPrice + INTERNET_TAX;
    }

    @Deprecated
    public void remoteWork() {
        System.out.println(name + " works from home.");
    }
}
