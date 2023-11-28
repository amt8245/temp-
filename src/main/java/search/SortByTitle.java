package search;

import java.util.Comparator;
import java.util.List;
import comic.IComic;

public class SortByTitle implements SearchSorter {
    public void doSort(List<IComic> searchResults) {
        searchResults.sort(Comparator.comparing(IComic::getSeriesTitle).thenComparing(IComic::getVolumeNumber)
                .thenComparing(IComic::getIssueNumber));
    }
}