package comic;

public class ComicGradedDecorator extends BaseComicDecorator {
    private final IComic wrapped;

    public ComicGradedDecorator(IComic wrapped, int grade) {
        super(wrapped, grade);
        this.wrapped = wrapped;
    }

    public double getValue() {
        int grade = super.getGrade();
        if(grade == 1) {
            return wrapped.getValue() * 0.1;
        }
        return Math.log10(grade) * wrapped.getValue() ;
    }
}
