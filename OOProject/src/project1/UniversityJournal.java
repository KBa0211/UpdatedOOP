package project1;

import java.util.ArrayList;
import java.util.List;

public class UniversityJournal {
    private String name;
    private List<ResearchPaper> papers;
    private List<String> subscribers;

    public UniversityJournal(String name) {
        this.name = name;
        this.papers = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
        notifySubscribers(paper);
    }

    public void subscribe(String subscriber) {
        subscribers.add(subscriber);
    }

    private void notifySubscribers(ResearchPaper paper) {
        System.out.println("Notifying subscribers about a new paper: " + paper.getTitle());
        for (String subscriber : subscribers) {
            System.out.println("Notification sent to: " + subscriber);
        }
    }
}
