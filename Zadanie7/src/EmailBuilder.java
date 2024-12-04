public interface EmailBuilder {
    EmailBuilder setSender(String sender);
    EmailBuilder setRecipient(String recipient);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
    Email build();
}
