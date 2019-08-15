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
    private Map<String, Room> Exits;// = new HashMap<String, Room>();

    public void setExits(String exitName, Room room){
        this.Exits.put(exitName, room);
        //System.out.println("Exit" +  this.Exits.get(exitName));
    }

    public Map<String, Room> getExits(){
        return this.Exits;
    }


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
    public void setItems(Item newItem){
        this.Items.add(newItem);
    }
    public List<Item> getItems(){
        return this.Items;
    }

    public Room Go(String direction){
        if(Exits.containsKey(direction)){
            return Exits.get(direction);
        }
        return null;
    }

    public Room(String roomName, String roomDescription) {
        setName(roomName);
        setDescription(roomDescription);
        setActivated(false);
        setLit(false);
        this.Exits = new HashMap<String, Room>();
    }


}
