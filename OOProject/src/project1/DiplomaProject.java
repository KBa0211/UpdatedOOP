package project1;

import java.util.ArrayList;
import java.util.List;

public class DiplomaProject {
    private String title;
    private List<ResearchPaper> publishedPapers;

    public DiplomaProject(String title) {
        this.title = title;
        this.publishedPapers = new ArrayList<>();
    }

    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public void printDetails() {
        System.out.println("Diploma Project Title: " + title);
        System.out.println("Published Papers:");
        for (ResearchPaper paper : publishedPapers) {
            System.out.println("- " + paper.getTitle());
        }
    }
}
