package comic;

public class ComicBook implements IComic {

    private String publisher;

    private String seriesTitle;

    private String volumeNumber;

    private String issueNumber;
    
    private String publicationDate;

    private String creators;

    private String principleCharacters;

    private String description;

    public ComicBook(String publisher, String seriesTitle, String volumeNumber2, String issueNumber2,
            String publicationDate) {
        this.publisher = publisher;
        this.seriesTitle = seriesTitle;
        this.volumeNumber = volumeNumber2;
        this.issueNumber = issueNumber2;
        this.publicationDate = publicationDate;
    }

    public ComicBook(String publisher, String seriesTitle, String volumeNumber, String issueNumber,
            String publicationDate,
            String creators, String principleCharacters, String description) {
        this(publisher, seriesTitle, volumeNumber, issueNumber, publicationDate);
        this.creators = creators;
        this.principleCharacters = principleCharacters;
        this.description = description;
    }

    // Getters
    public String getPublisher() {
        return publisher;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public String getVolumeNumber() {
        return volumeNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getCreators() {
        return creators;
    }

    public String getPrincipleCharacters() {
        return principleCharacters;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return 0;
    }

    // Setters
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public void setVolumeNumber(String volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setCreators(String creators) {
        this.creators = creators;
    }

    public void setPrincipleCharacters(String principleCharacters) {
        this.principleCharacters = principleCharacters;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return(this.publisher + this.seriesTitle + this.volumeNumber + this.issueNumber + this.publicationDate);
    }
}