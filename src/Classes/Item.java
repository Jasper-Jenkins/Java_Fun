package Classes;

import Interfaces.IItem;

public class Item implements IItem {
    private String name;
    private String description;

    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public String getDescription(){
        return description;
    }

    public Item (String itemName, String itemDescription){
        setName(itemName);
        setDescription(itemDescription);
    }


}