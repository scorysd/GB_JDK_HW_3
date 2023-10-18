package gb.pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(2,"dsf");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        System.out.println(pair);


    }
}
