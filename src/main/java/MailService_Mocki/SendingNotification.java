package MailService_Mocki;

public class SendingNotification {


    private EmailService emailService;
    private PigeonService pigeonService;

    public SendingNotification(EmailService emailService, PigeonService pigeonService) {
        this.emailService = emailService;
        this.pigeonService = pigeonService;
    }

    public void sendNotification() {
        if (emailService.isAvailable()) {
            emailService.sendEmail("Email został wysłany");
        }
        else if (pigeonService.isAvailable()) {
            pigeonService.sendMessgae("Gołąd został wysłany");
        }
        else {
            throw new IllegalStateException("Musi być dostępny jeden z serwisów: email lub gołąb");
        }
    }


}
