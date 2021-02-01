package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Sam");

        System.out.println(groceryLine);

        groceryLine.remove(1);
        groceryLine.remove("Sam");

        System.out.println(groceryLine);

        String jerome = groceryLine.get(0);

        System.out.println(jerome);

        groceryLine.add("Sam");

        int samIndex = groceryLine.indexOf("Pam");
        System.out.println(samIndex);

        System.out.println(groceryLine.size());

        for (String name : groceryLine) {
            System.out.println(name);
        }

        groceryLine.clear();
    }
}
