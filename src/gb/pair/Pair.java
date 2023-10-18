package gb.pair;

public class Pair <T, E>{
    T param1;
    E param2;

    public Pair(T param1, E param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public T getFirst(){
        return param1;
    }
    public E getSecond(){
        return param2;
    }
    @Override
    public String toString(){
        System.out.print("Строковое представление: ");
        return param1.toString() + " " + param2.toString();
    }
}
