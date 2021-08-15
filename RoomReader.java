package textgame;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomReader {
    private static String separator = ":";

    /**
     * This is way way too hard, we will retry this using JSON objects
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File f = new File("rooms.txt");
        List<String> lines = FileUtils.readLines(f,"UTF-8");
        // check if line is just an int (indicating room) and read until next int
        String roomText = "";
        List<String> roomsTextList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            String current = lines.get(i);
            try {
                int roomID = Integer.parseInt(current);
                roomsTextList.add(roomText);
                roomText = roomID + "";
            } catch(Exception e) {
                roomText += separator + current;
            }
        }

        getMapFromRoomsText(roomsTextList);
    }

    private static Map<Integer,Room> getMapFromRoomsText(List<String> roomsTextList) {
        Map<Integer,Room> roomsMap = new HashMap<>();
        for(String roomText: roomsTextList) {
            System.out.println(roomText);
            String[] tokens = roomText.split(separator);
            //System.out.println(tokens[0]);  // room id
            //System.out.println(tokens[1]); // room name
            //System.out.println(tokens[2]); // room description
            //System.out.println(tokens[3]); // room direction
        }
        return null;
    }
}
