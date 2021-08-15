package midterm;

import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        String[] loggedData = {"tim","tim","tim","abby","abby","bob","bob","sam","lisa"};
        Set<String> users = new TreeSet<>();
        for (int i=0; i < loggedData.length; i++) {
            users.add(loggedData[i]);
        }
        System.out.println(users);
    }
}
