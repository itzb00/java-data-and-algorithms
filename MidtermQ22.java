package midterm;

import org.apache.commons.io.IOUtils;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class MidtermQ22 {
    public static void main(String[] args) throws Exception {

        String site = "https://gist.githubusercontent.com/tacksoo/4cee1af7458cf26747bd0c3d998d00f0/raw/19a54f2644a901aa18cd229650cd0ed44ff80f3b/stonks.csv";
        URL url = new URL(site);
        String content = IOUtils.toString(url.openStream(), "UTF-8");
        String[] lines = content.split("\n");
        //System.out.println(content);
        Set<String> uniqueNames = new HashSet<>();
        for (String line : lines) {
            String[] words = line.split(",");
            String key = words[0];
            if (!uniqueNames.contains(key)) {
                System.out.println(key);
                uniqueNames.add(key);
            }
        }
    }
}