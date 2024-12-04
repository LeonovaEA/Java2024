public class Director {
    private EmailBuilder emailBuilder;

    public Director(EmailBuilder emailBuilder) {
        this.emailBuilder = emailBuilder;
    }

    public Email constructEmail(String sender, String recipient, String subject, String body) {
        return emailBuilder.setSender(sender)
                .setRecipient(recipient)
                .setSubject(subject)
                .setBody(body)
                .build();
    }
}