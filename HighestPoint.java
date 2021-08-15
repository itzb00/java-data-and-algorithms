package midterm;

import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HighestPoint {
    public static void main(String[] args) throws Exception {
        String link = "https://gist.githubusercontent.com/tacksoo/32e5badc23f992b9dce6c8a65c456edf/raw/0105d13f86f5b5741d1efd00a382a43e3b5c8cd2/highpoints.csv";
        URL url = new URL(link);
        String content = IOUtils.toString(url.openStream(),"UTF-8");
        //System.out.println(content);
        String[] lines = content.split("\n");
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(",");
            result.put(words[0],words[1]);
        }
        System.out.println("Highest point in Georgia is " + result.get("Georgia"));
    }
}
