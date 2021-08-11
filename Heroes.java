package hero;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.*;

public class Heroes {

    public static void main(String[] args) throws Exception {
        Map<String, String> heroes = new TreeMap<>();
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter name of hero: ");
            String name = keyboard.nextLine();
            System.out.println("Please enter home town of hero: ");
            String town = keyboard.nextLine();
            heroes.put(name, town);
            System.out.println("Type quit to end or enter to continue: ");
            String choice = keyboard.nextLine();
            if (choice.equals("quit")) {
                break;
            }
        }

        for (String hero : heroes.keySet()) {
            String line = hero + ":" + heroes.get(hero) + "\n";
            FileUtils.write(new File("heroes.txt"), line, "UTF-8", true);
        }
    }
}
