package midterm;

import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

public class MidtermQ18 {
    public static void main(String[] args) throws Exception {

        String site = "https://gist.githubusercontent.com/tacksoo/5e818368d802ec23b5e630a4b9d8ffd6/raw/60cfb311a1388339a4e082b6deb76f5efcdc2025/colleges.csv";
        URL url = new URL(site);
        String content = IOUtils.toString(url.openStream(), "UTF-8");
        String[] lines = content.split("\n");
        //System.out.println(content);

        Map<String, Integer> count = new TreeMap<>();

        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(",");
            String key = words[words.length - 1];
            if (count.containsKey(key)) {
                int value = count.get(key);
                value++;
                count.put(key, value);
            } else {
                count.put(key, 1);
            }
        }
        //System.out.println(count);
        System.out.println("The number of schools in the US is: " + count.get("United States of America"));
    }
}


