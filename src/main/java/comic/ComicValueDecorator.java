package comic;

public class ComicValueDecorator extends BaseComicDecorator {
    public ComicValueDecorator(IComic wrapped, double value) {
        super(wrapped, value);
    }

    public double getValue() {
        return super.getValue();
    }
}
