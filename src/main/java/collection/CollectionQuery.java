package collection;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

import com.opencsv.*;

import comic.*;

public class CollectionQuery {
    public CollectionQuery() {
    }

    public List<IComic> getCollection() {
        List<IComic> comicBookList = new ArrayList<>();
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader("./src/db/comics.csv"))
                            .withCSVParser(new CSVParserBuilder()
                            .withQuoteChar('"')
                            .build()).build();
            String[] nextline ;
            while ((nextline = reader.readNext()) != null) {
                String[] volume = nextline[5].split("Vol.|, Vol.", 0);
                IComic tempComic;
                if ( volume.length == 1 ) {
                    tempComic = new ComicBook(nextline[4], nextline[0], "1", volume[0], nextline[5], nextline[8], "", nextline[3]);
                } else {
                    tempComic = new ComicBook(nextline[4], nextline[0], volume[1], volume[0], nextline[5], nextline[8], "", nextline[3]);
                }
                comicBookList.add(tempComic);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
