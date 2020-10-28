package appearancepattern;

public class Disk implements Operation {
    @Override
    public void startup() {
        System.out.println("start Disk!");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown Disk!");
    }
}
