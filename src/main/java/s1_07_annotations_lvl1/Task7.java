package s1_07_annotations_lvl1;

public class Task7 {
    public static void main(String[] args) {
        Worker genericWorker = new Worker("Allegretto", "Roux", 15);
        OnlineWorker remoteWorker = new OnlineWorker("Yue", "The Tiny Dog", 18);
        PresentialWorker officeWorker = new PresentialWorker("Happy", "The Cute Dog", 20);

        System.out.println("Basic worker salary: " + genericWorker.salaryCalculator(160));
        System.out.println("Online worker salary: " + remoteWorker.salaryCalculator(160));
        System.out.println("Office worker salary: " + officeWorker.salaryCalculator(160));

        // Deprecated methods
        remoteWorker.remoteWork();
        officeWorker.officeWork();
    }
}
