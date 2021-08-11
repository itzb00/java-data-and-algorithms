package IOPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class GameObjectReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("game_objects.dat"));
        Game[] g = (Game[]) ois.readObject();
        System.out.println(Arrays.toString(g));
    }
}
