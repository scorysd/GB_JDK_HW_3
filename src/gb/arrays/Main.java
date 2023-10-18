package gb.arrays;

public class Main {
    public static void main(String[] args) {
        String[] ar1 = {"1", "d", "a"};
        String[] ar2 = {"1", "d", "a"};
        String[] ar3 = {"1", "d", "4"};

        CompareArrays ca = new CompareArrays();

        System.out.println(ca.compare(ar1, ar2));
        System.out.println(ca.compare(ar1, ar3));



    }
}
