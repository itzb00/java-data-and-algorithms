package review;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.util.List;

public class FileIOExample {
    public static final String WEATHER_URL = "https://api.darksky.net/forecast/3c5084c558861c1610447b49a45f4eb4/33.951261,-84.033882";

    public static void main(String[] args) throws Exception {

        List<String> lines = FileUtils.readLines(new File("states.txt"), "UTF-8");
        System.out.println(lines);

        URL url = new URL(WEATHER_URL);

        String json = IOUtils.toString(url.openStream(), "UTF-8");
        System.out.println(json);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode tree = mapper.readTree(json);
        JsonNode currently = tree.get("currently");
        JsonNode temperature = currently.get("temperature");
        String tempStr = temperature.toString();
        double temp = Double.parseDouble(tempStr);
        System.out.println(temp);
    }
}
