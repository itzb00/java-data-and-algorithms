package midterm;

import org.apache.commons.io.IOUtils;

import java.net.URL;

public class FileDLExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.ggc.edu");
        String content = IOUtils.toString(url.openStream(),"UTF-8");
        System.out.println(content);
    }
}
