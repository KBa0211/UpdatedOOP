package ResearchActivities;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

abstract class Researcher {
    protected String name;
    protected List<ResearchPaper> papers;
    protected List<ResearchProject> projects;
    //constructor
    public Researcher(String name) {
        this.name = name;
        this.papers = new ArrayList<>();
        this.projects = new ArrayList<>();
    }
    //other methods
    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
    }
    public void addProject(ResearchProject project) {
        projects.add(project);
    }

    //print papers sorted by comparator 
    public void PrintPapers(Comparator<ResearchPaper> c) {
        papers.sort(c);
        for (ResearchPaper paper : papers) {
            System.out.println(paper);
        }
    }
    //h - index
    public int calculateHIndex() {
        papers.sort((p1, p2) -> Integer.compare(p2.getCitations(), p1.getCitations()));
        int hIndex = 0;
        for (int i = 0; i < papers.size(); i++) {
            if (papers.get(i).getCitations() >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        return hIndex;
    }
    public String getName() {
        return name;
    }
}

