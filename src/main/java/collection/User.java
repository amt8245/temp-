package collection;

import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class User {
    private Map<String, String> users;
    public User() {
    }

    public void getCollection() {
        this.users = new HashMap<String, String>();
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader("./src/db/users.csv"))
                            .withCSVParser(new CSVParserBuilder()
                            .withQuoteChar('"')
                            .build()).build();
            String[] nextline ;
            while ((nextline = reader.readNext()) != null) {
                users.put(nextline[0],nextline[1]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean login(String username, String password) {
        if(this.users.containsKey(username) && this.users.get(username).equals(password)){
            return true;
        }
        return false;
    }
}
