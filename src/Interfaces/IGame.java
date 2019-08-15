package Interfaces;

import Classes.Player;
import Classes.Room;

public interface IGame {
    void setCurrentRoom(Room room);
    Room getCurrentRoom();

    void setCurrentPlayer(Player player);
    Player getCurrentPlayer();

    void setInGame(Boolean inGame);
    Boolean getInGame();

    void Setup();
    void Play();
    void Reset();

    //No need to Pass a room since Items can only be used in the CurrentRoom
    void useItem(String itemName);
}
