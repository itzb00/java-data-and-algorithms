package midterm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.net.URL;

public class JSonExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://ggc.edu");
        String json = IOUtils.toString(url.openStream(),"UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        JsonNode currently = root.get("currently");
        JsonNode temp = currently.get("temperature");
        System.out.println(temp.asText());
    }
}
