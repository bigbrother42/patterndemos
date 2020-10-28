package factorypattern;

/**
 * @author bigbrother
 */
public class SenderFactory {

    public static Sender procudeMail(){
        return new MailSender();
    }

    public static Sender ProduceSms(){
        return new SmsSender();
    }

}
