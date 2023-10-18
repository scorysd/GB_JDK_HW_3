package gb.database;

public interface CRUD<T> {
    void create();
    void read();
    void update(T s);
    void delete();
}
