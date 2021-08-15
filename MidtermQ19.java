package midterm;

import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.PriorityQueue;

public class MidtermQ19  {
    public static void main(String[] args) throws Exception {
        String link = "https://gist.githubusercontent.com/tacksoo/7d5f3a08d4d31335b5e2d8cb91630153/raw/8e0250840affeac9f33edd65d518be06a78b5145/amazon.csv";
        URL url = new URL(link);
        String content = IOUtils.toString(url.openStream(), "UTF-8");
        String[] lines = content.split("\n");
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (String line : lines) {
            String[] words = line.split(",");
            pq.add(Double.parseDouble(words[2]));
        }
        System.out.println("The 5 lowest AMZN prices are: ");
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
