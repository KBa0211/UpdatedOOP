package project1;

import java.util.ArrayList;
import java.util.List;

public class News {
    private String topic;
    private String content;
    private boolean isPinned;
    private List<String> comments;

    public News(String topic, String content, boolean isPinned) {
        this.topic = topic;
        this.content = content;
        this.isPinned = isPinned;
        this.comments = new ArrayList<>();
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void printNews() {
        System.out.println("Topic: " + topic + (isPinned ? " (Pinned)" : ""));
        System.out.println("Content: " + content);
        System.out.println("Comments:");
        for (String comment : comments) {
            System.out.println("- " + comment);
        }
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }
}
