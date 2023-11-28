package search;

import java.util.List;
import comic.IComic;

public interface SearchSorter {
    public void doSort(List<IComic> searchResults);
}