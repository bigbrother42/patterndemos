package factorypattern;

/**
 * @author bigbrother
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SenderFactory.procudeMail();
        sender.send();
    }

}
