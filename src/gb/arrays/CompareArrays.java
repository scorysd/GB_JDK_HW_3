package gb.arrays;

public class CompareArrays<T> {
    public  <T> boolean compare(T[] array1, T[] array2){
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }
}
