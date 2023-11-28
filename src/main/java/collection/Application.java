package collection;

public class Application {

    public static void main(String[] args) {
        System.out.println("Starting Application...");
        CollectionQuery tempTest = new CollectionQuery();
        tempTest.getCollection();
        User users = new User();
        users.getCollection();
        System.out.println(users.login("user1","123"));
    }

}
