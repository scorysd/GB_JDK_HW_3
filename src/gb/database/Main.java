package gb.database;

public class Main {
    public static void main(String[] args) {
        CRUD db = new DataBaseText();
        db.delete();
        db.create();
        db.update("first");
        db.update("second");
        db.update("third");
        db.update(4);
        db.read();
        db.create();
    }
}
