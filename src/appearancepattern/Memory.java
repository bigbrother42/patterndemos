package appearancepattern;

public class Memory implements Operation {
    @Override
    public void startup() {
        System.out.println("start Memory!");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown Memory!");
    }
}
