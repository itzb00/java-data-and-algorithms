package games;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class CheapSharkExample {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.cheapshark.com/api/1.0/deals?storeID=1&upperPrice=15");
            String json = IOUtils.toString(url.openStream(),"UTF-8");
            ObjectMapper mapper = new ObjectMapper();
            JsonNode tree = mapper.readTree(json);
            Set<Game> gameDeals = new TreeSet<>(new Comparator<Game>() {
                @Override
                public int compare(Game o1, Game o2) {
                    return o2.getHoursPlayed() - o1.getHoursPlayed();
                }
            });
            // create a map where Map<String,Game>
            for (int i = 0; i < tree.size(); i++) {
                JsonNode current = tree.get(i);
                String title = current.get("title").toString().replace("\"","");
                double price = Double.parseDouble(current.get("salePrice").toString().replace("\"",""));
                Random r = new Random();
                Game game = new Game(title, r.nextInt(2000),10.00);
                gameDeals.add(game);
            }

            for (Game game: gameDeals) {
                System.out.println(game.getTitle() + " " + game.getHoursPlayed());
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException("Sorry something is wrong with your URL");
        } catch (IOException e) {
            throw new RuntimeException("Sorry something went wrong when trying to open url");
        }
    }
}
