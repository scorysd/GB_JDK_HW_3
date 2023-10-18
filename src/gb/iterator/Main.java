package gb.iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer> myCol = new MyCollection<Integer>(new Integer[10]);
//        myCol.printCollection();
        myCol.addItem(12);
        myCol.addItem(14);
        myCol.addItem(17);
        myCol.addItem(23);
        myCol.addItem(54);
//        myCol.delItem(1);
//        myCol.printCollection();
        for (Integer i: myCol) {
            System.out.printf(i + " ");
        }
    }

}
