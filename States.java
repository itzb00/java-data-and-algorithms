package review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class States {
    public static void main(String[] args) throws IOException {

        String filePath = "states.txt";
        HashMap<String, String> map = new HashMap<String, String>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(",", 2);
            if (words.length >= 2) {
                String key = words[1];
                String value = words[0];
                map.put(key, value);
            }
        }
        System.out.println("The size of the hashmap is: " + map.size());
        System.out.println("The abbreviation for GA is " + map.get("GA"));
    }
}
