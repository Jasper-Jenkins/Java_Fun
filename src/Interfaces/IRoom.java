package Interfaces;

import Classes.Item;

import java.util.List;

public interface IRoom {
    void setName(String name);
    String getName();

    void setDescription(String name);
    String getDescription();

    void setItems(Item newItem);
    List<Item> getItems();

}
