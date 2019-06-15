package challenges;

public class MailSender implements InformationService{

    @Override
    public void send(User user) {
        System.out.println("sending mail to user");
    }
}
