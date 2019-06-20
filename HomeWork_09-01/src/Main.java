import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myList.add("" + i);
        }

        System.out.println("The list: " + myList);

        myList.remove(0);
        myList.remove(0);
        myList.remove(myList.size() - 1);
        System.out.println("After removing two first and the last items list looks like: " + myList);

    }

}
