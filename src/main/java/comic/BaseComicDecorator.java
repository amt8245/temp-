package comic;

public abstract class BaseComicDecorator implements IComic {
    private final IComic wrapped;
    private double value;
    private int grade;

    BaseComicDecorator(IComic wrapped, int grade) {
        this.wrapped = wrapped;
        this.grade = grade;
    }

    BaseComicDecorator(IComic wrapped, double value) {
        this.wrapped = wrapped;
        this.value = value;
    }

    BaseComicDecorator(IComic wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public double getValue() {
        return value;
    }

    public String getPublisher() {
        return wrapped.getPublisher();
    }

    public String getPublicationDate() {
        return wrapped.getPublicationDate();
    }

    public String getIssueNumber() {
        return wrapped.getIssueNumber();
    }

    public String getVolumeNumber() {
        return wrapped.getVolumeNumber();
    }

    public String getSeriesTitle() {
        return wrapped.getSeriesTitle();
    }

    public int getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return this.value + wrapped.toString();
    }
}
