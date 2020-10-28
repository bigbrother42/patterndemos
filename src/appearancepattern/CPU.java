package appearancepattern;

public class CPU implements Operation {
    @Override
    public void startup() {
        System.out.println("start CPU!");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown CPU!");
    }
}
