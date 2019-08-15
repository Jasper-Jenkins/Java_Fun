package Classes;

import Interfaces.IRoom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room implements IRoom {
    private String name;
    private String description;
    private boolean activated;
    private boolean lit;
    private List<Item> Items;

    public void setItems(Item newItem){
        this.Items.add(newItem);
    }
    public List<Item> getItems(){
        return this.Items;
    }

    public Map<String, Room> Exits = new HashMap<String, Room>();

    public void setName(String newName) {
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public String getDescription(){
        return this.description;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    public boolean getActivated(){
        return this.activated;
    }
    public void setLit(boolean lit) {
        this.lit = lit;
    }
    public boolean getLit() {
        return this.lit;
    }

    public Room Go(String direction){
        if(Exits.containsKey(direction)){
            return Exits.get(direction);
        }
        return null;
    }
    public Room(String roomName, String roomDescription){
        this.name = roomName;
        this.description = roomDescription;
        setActivated(false);
        setLit(false);
        this.Items = getItems();
    }


}
