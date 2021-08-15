package textgame;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class SerializeRoomExample {
    public static void main(String[] args) throws Exception {
        // write objects as a json array
        Room homeRoom = new Room(1, "ITEC 3150 room W1104", "Awesome room for ITEC 3150", "no directions");
        Room drimsOffice = new Room(2, "Dr Im's Office Room", "Dr Im's comfortable fortress of solitude", "no directions");
        List<Room> roomsList = new ArrayList<>();
        roomsList.add(homeRoom);
        roomsList.add(drimsOffice);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(roomsList);
        System.out.println(json);

        // read it back as room objects
        JsonNode root = mapper.readTree(json);
        System.out.println(root.get(0));
        System.out.println(root.get(1));

    }

}
