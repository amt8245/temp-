package search;

import java.util.List;

import comic.IComic;

public class SearchResults {
    private List<IComic> searchResults;
    private SearchSorter sorter;

    public SearchResults(List<IComic> searchResults) {
        this.searchResults = searchResults;
        sorter = new SortByTitle();
    }

    public void setSorter(SearchSorter sorter) {
        this.sorter = sorter;
    }

    public void doSort() {
        sorter.doSort(searchResults);
    }

    public List<IComic> getSearchResults() {
        return searchResults;
    }

}
