package abstractfactorypattern;

public class Test {
    public static void main(String[] args) {
        Provider provider = new SenderMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
