package gb.person;

public class Worker implements Person{
    @Override
    public void doWork() {
        System.out.println("Working!");
    }

    @Override
    public void haveRest() {
        System.out.println("DONT HAVE A REST!");

    }
}
