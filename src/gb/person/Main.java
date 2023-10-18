package gb.person;

public class Main {
    public static void main(String[] args) {

        Person[] people = {new Worker(), new LazyMan(), new Worker(),
                            new Worker(), new LazyMan(), new Worker(),
                            new LazyMan(),new LazyMan(),new LazyMan(),
                            new LazyMan(),new Worker()};

        WorkPlace<? extends Person> factory = new WorkPlace<>(people);
        Club<? extends Person> nightClub = new Club<>(people);

        for (Person person: people) {
            person.doWork();
        }
        
//        factory.workingAll();
//        System.out.println();
//        nightClub.partyAll();




    }
}
