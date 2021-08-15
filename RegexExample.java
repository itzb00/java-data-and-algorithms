package review;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String str = "ITEC3150";
        boolean b = str.matches("\\w\\w\\w\\w\\d\\d\\d\\d");
        String ticker = "NOK";
        boolean b2 = ticker.matches("NOK");
        System.out.println(b);
        System.out.println(b2);

        String text = "The four stonks that we have are: BB, AMC, NOK and GME. These stonks are guaranteed" +
                " to 'moon' soon and it will make a lot of people rich." +
                "of course the very opposite can happen so you should invest only that you can lose" +
                ". My favorite of the four is NOK";

        //parse through text to find how many occurrences of the desired pattern
        Pattern pattern = Pattern.compile("NOK");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while(matcher.find()) {
            count ++;
            System.out.println(matcher.group());
        }
        System.out.println("Program found " + count + " occurrences of " + pattern + ".");
    }
}
