package IOPractice;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class GameReader {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
        Game[] games = new Game[3];
        for (int i = 0; i < games.length; i++) {
            games[i] = new Game(dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readUTF(), dis.readDouble(), dis.readInt());
        }
        System.out.println(Arrays.toString(games));
    }
}
