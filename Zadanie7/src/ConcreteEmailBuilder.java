public class ConcreteEmailBuilder implements EmailBuilder {
    private String sender;
    private String recipient;
    private String subject;
    private String body;

    @Override
    public EmailBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public EmailBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public EmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public Email build() {
        return new Email(sender, recipient, subject, body);
    }
}
