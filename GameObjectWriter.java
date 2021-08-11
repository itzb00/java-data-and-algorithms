package IOPractice;

import java.io.*;
import java.util.Arrays;

public class GameObjectWriter implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("game_objects.dat"));
        Game[] games = new Game[3];
        Game mario = new Game("Super Mario Bros", "NES", "Nintendo", "2D", 9.0, 1983);
        Game zelda = new Game("Breath of the Wild", "Switch", "Nintendo", "RPG", 10.0, 2017);
        Game wow = new Game("World of Warcraft", "PC", "Blizzard", "RPG", 9.5, 2004);
        games[0] = mario;
        games[1] = zelda;
        games[2] = wow;
        oos.writeObject(games);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("game_objects.dat"));
        Game[] s = (Game[]) ois.readObject();
        System.out.println(Arrays.toString(s));
    }
}
