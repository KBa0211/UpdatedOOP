package ResearchActivities;

class ResearchPaper {
    private String title;
    private String authors;
    private String journal;
    private int citations;
    private String doi;
    private String datePublished;
    private int pages;
    enum Format {
        PLAIN_TEXT,
        BIBTEX
    }
    //constructor
    public ResearchPaper(String title, String authors, String journal, int citations, String doi, String datePublished, int pages) {
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.citations = citations;
        this.doi = doi;
        this.datePublished = datePublished;
        this.pages = pages;
    }
    public int getCitations() {
        return citations;
    }
    public String getCitation(Format format) {
        if (format == Format.PLAIN_TEXT) {
            return title + " by " + authors + ", " + journal + ", " + datePublished + ", DOI: " + doi;
        } else {
            return "@article:" + title.replace(" ", "_") + ",\n" +
                   "  author = " + authors + ",\n" +
                   "  journal = " + journal + ",\n" +
                   "  title = " + title + ",\n" +
                   "  year = " + datePublished.split("-")[0] + ",\n" +
                   "  doi = " + doi + "\n" +
                   "";
        }
    }
    public int getPages() {
        return pages;
    }
    @Override
    public String toString() {
        return title + " by " + authors + ", Journal: " + journal + ", Citations: " + citations + ", Published on: " + datePublished;
    }
}

