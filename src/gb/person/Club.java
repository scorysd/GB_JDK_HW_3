package gb.person;

public class Club<T extends Person>{
    private T[] persons;

    public Club(T[] persons) {
        this.persons = persons;
    }
    public void partyAll(){
        for (T item: persons) {
            item.haveRest();
        }
    }
}
