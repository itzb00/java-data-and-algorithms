package textgame;

import java.util.Objects;

public class Room {
    private int id;
    private String roomName;
    private String description;
    private String direction;

    public Room(int id, String roomName, String description, String direction) {
        this.id = id;
        this.roomName = roomName;
        this.description = description;
        this.direction = direction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id && Objects.equals(roomName, room.roomName) && Objects.equals(description, room.description) && Objects.equals(direction, room.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomName, description, direction);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", description='" + description + '\'' +
                ", direction=" + direction +
                '}';
    }
}
