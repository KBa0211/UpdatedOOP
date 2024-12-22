package project1;

import project1.Message;
import java.util.ArrayList;
import java.util.List;

public class DiplomaProject {
    private String title;
    private List<Message> publishedPapers;

    public DiplomaProject(String title) {
        this.title = title;
        this.publishedPapers = new ArrayList<>();
    }

    public void addPublishedPaper(Message paper) {
        publishedPapers.add(paper);
    }

    public void printDetails() {
        System.out.println("Diploma Project Title: " + title);
        System.out.println("Published Papers:");
        for (Message paper : publishedPapers) {
            System.out.println("- " + paper.getContent());
        }
    }
}