package midterm;

import java.util.Set;
import java.util.TreeMap;

public class practiceStuff {
    public static void main(String[] args) {
            String s = "bbaabbbbcccc";
            char[] chars = s.toCharArray();
            TreeMap<Character,Integer> tree = new TreeMap<Character, Integer>();
            Set<Character> keySet = tree.keySet();
            //System.out.println(chars);

            for (char key : chars) {
                if(!tree.containsKey(key)){
                    tree.put(key, 1);
                }
                else {
                    tree.put(key, tree.get(key)+1);
                }
            }
        for (Character key : keySet) {
            System.out.print(key);
            System.out.print(tree.get(key));
        }
        }
    }

