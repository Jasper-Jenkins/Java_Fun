package Classes;

import Interfaces.IPlayer;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPlayer {
    private String name;
    private Integer deaths;
    private Boolean alive;
    private List<Item> inventory;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDeaths(Integer deaths){
        this.deaths = deaths;
    }
    public Integer getDeaths(){
        return this.deaths;
    }
    public void setAlive(Boolean alive){
        this.alive = alive;
    }
    public Boolean getAlive() {
        return this.alive;
    }
    public void setInventory(Item item){
        this.inventory.add(item);
    }
    public List<Item> getInventory(){
        return this.inventory;
    }

    public Player(String name){
        setName(name);
        setDeaths(0);
        setAlive(true);
        this.inventory = new ArrayList<Item>();
    }
}
