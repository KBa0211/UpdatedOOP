package ResearchActivities;
import java.util.ArrayList;
import java.util.List;

class ResearchProject {
    private String topic;
    private List<Researcher> participants;
    private List<ResearchPaper> publishedPapers;
    //constructor
    public ResearchProject(String topic) {
        this.topic = topic;
        this.participants = new ArrayList<>();
        this.publishedPapers = new ArrayList<>();
    }
    public void addParticipant(Researcher researcher) throws Exception {
        if (researcher instanceof Researcher) {
            participants.add(researcher);
        } else {
            throw new Exception("Only researchers can participate in the project.");
        }  
    }
    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }
    //getters
    public String getTopic() {
        return topic;
    }
    public List<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }
}
