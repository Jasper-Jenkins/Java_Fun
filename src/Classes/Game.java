package Classes;
import Interfaces.IGame;

public class Game implements IGame {
    private Room currentRoom;
    private Player currentPlayer;
    private Boolean inGame;

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }
    public Room getCurrentRoom(){
        return this.currentRoom;
    }
    public void setCurrentPlayer(Player currentPlayer){
        this.currentPlayer = currentPlayer;
    }
    public Player getCurrentPlayer(){
        return this.currentPlayer;
    }
    public void setInGame(Boolean inGame){
        this.inGame = inGame;
    }
    public Boolean getInGame(){
        return this.inGame;
    }



    public void Reset(){
        Setup();
    }

    public void Play(){

    }

    public void Setup(){

    }

    public void useItem(String itemName){

    }

}


