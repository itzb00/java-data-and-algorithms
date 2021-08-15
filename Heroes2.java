package hero;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Heroes2 {

    public static void main(String[] args) {
        Set<Hero> heroes = new TreeSet<>();
//        Set<Hero> heroes = new TreeSet<>(new Comparator<Hero>() {
//            @Override
//            public int compare(Hero o1, Hero o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the name of the hero: ");
            String name = keyboard.nextLine();
            System.out.println("Please enter the age of the hero: ");
            int age = Integer.parseInt(keyboard.nextLine());
            System.out.println("Please enter the home town of the hero: ");
            String homeTown = keyboard.nextLine();
            System.out.println(name + " " + age + " " + homeTown);
            Hero hero = new Hero(name, age, homeTown);
            heroes.add(hero);
            System.out.println("Currently, we have: ");
            System.out.println(heroes);
        }
    }
}
