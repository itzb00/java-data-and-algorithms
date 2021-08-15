package games;


import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GameAnalysis {

    public static void main(String[] args) throws Exception {
        String gistURL = "https://gist.githubusercontent.com/tacksoo/df8c587b6d17c93a669e083aef71845b/raw/899100d1320d8ac523a74fd8a048700138efaa0c/games.csv";
        URL url = new URL(gistURL);
        String content = IOUtils.toString(url.openStream(), "UTF-8");
        //System.out.println(content);
        String[] lines = content.split("\n");
        //System.out.println(Arrays.toString(lines));
        Map<String, Double> games = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String[] tokens = line.split(",");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            //System.out.println(name);
            //System.out.println(price);
            games.put(name, price);
        }
        System.out.println("My current favorite game is fallout 4 which is " +
                games.get("fallout 4") + " dollars");
    }
}
