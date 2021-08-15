package midterm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;


public class MidtermQ20 {
    public static final String deals = "https://www.cheapshark.com/api/1.0/deals?storeID=7";

    public static void main(String[] args) throws IOException, InterruptedException {
        URL url = new URL(deals);
        String data = IOUtils.toString(url.openStream(), "UTF-8");
        //System.out.println(data);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode tree = mapper.readTree(data);
        System.out.println("Printing all titles...");
        Thread.sleep(1000);
        for (int i = 0; i < 60; i++) {
            JsonNode section = tree.get(i);
            JsonNode title = section.get("title");
            System.out.println(title);
        }
    }
}

