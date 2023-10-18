package gb.person;

public class LazyMan implements Person{
    @Override
    public void doWork() {
        System.out.println("DONT WANT a WORKING!");
    }

    @Override
    public void haveRest() {
        System.out.println("Party! Eeeeeee!");

    }
}
