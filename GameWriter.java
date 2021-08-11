package IOPractice;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GameWriter {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
        Game[] games = new Game[3];
        Game mario = new Game("Super Mario Bros", "NES", "Nintendo", "2D", 9.0, 1983);
        Game zelda = new Game("Breath of the Wild", "Switch", "Nintendo", "RPG", 10.0, 2017);
        Game wow = new Game("World of Warcraft", "PC", "Blizzard", "RPG", 9.5, 2004);
        games[0] = mario;
        games[1] = zelda;
        games[2] = wow;
        for (int i = 0; i < games.length; i++) {
            dos.writeUTF(games[i].getTitle());
            dos.writeUTF(games[i].getSystem());
            dos.writeUTF(games[i].getDeveloper());
            dos.writeUTF(games[i].getCategory());
            dos.writeDouble(games[i].getRating());
            dos.writeInt(games[i].getYear());
        }
        dos.close();
    }
}
