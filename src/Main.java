import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);

        Collections.sort(intList);

        Iterator<Integer> it = intList.iterator();

        while (it.hasNext()) {
            int number = it.next();
            if (number > 0 && number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
