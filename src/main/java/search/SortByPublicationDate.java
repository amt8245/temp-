package search;

import java.util.Comparator;
import java.util.List;
import comic.IComic;

public class SortByPublicationDate implements SearchSorter {
    public void doSort(List<IComic> searchResults) {
        searchResults.sort(new ComicPublicationDateComparator());
    }
}