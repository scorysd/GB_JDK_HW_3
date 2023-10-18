package gb.database;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataBaseText<T> implements CRUD<T> {
    @Override
    public void create() {
        try {
            File f = new File("db.txt");
            if (f.createNewFile())
                System.out.println("File created!");
            else
                System.out.println("File already exists!");
        } catch (Exception e) {
            System.err.println();
        }
    }

    @Override
    public void read() {
        try (FileReader reader = new FileReader("db.txt")) {
            int c;
            while((c=reader.read())!=-1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void update(T str) {
        try (FileWriter writer = new FileWriter("db.txt", true)) {
            writer.write(str.toString());
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void delete() {
        try {
            File f = new File("db.txt");
            if (f.delete())
                System.out.println("File Deleted!");
            else
                System.out.println("File not exists!");
        } catch (Exception e) {
            System.err.println();
        }

    }
}
