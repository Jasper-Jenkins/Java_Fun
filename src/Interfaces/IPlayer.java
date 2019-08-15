package Interfaces;

import Classes.Item;

import java.util.List;

public interface IPlayer {
    void setName(String name);
    String getName();

    void setDeaths(Integer deaths);
    Integer getDeaths();

    void setInventory(Item item);
    List<Item> getInventory();
}
