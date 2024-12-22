package project1;

public class Message {
    private String sender;
    private String recipient;
    private String content;

    public Message(String sender, String recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public void printMessage() {
        System.out.println("From: " + sender);
        System.out.println("To: " + recipient);
        System.out.println("Content: " + content);
    }
}
