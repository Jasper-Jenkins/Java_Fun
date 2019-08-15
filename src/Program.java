import Classes.Item;
import Classes.Player;
import Classes.Room;

import java.io.Console;
import java.util.concurrent.TimeUnit;

public class Program {
    public static void main (String[] args) throws InterruptedException {

      //All of this is test to see if things are working.
        System.out.println("Hello World");

        Player player1 = new Player("Jasper");
        player1.setDeaths(10);
        Thread.sleep(1000);

        System.out.println("You have died " + player1.getDeaths() + " times.");


        Item itemOne = new Item("Fire", "Hot as hades");

        System.out.println("Here is your item: " + itemOne.getName());
        System.out.println("Here is your items description: " + itemOne.getDescription());

        Room room1 = new Room("main", "Cool room for sure");
        Room room2 = new Room("east", "East Room");
        System.out.println("Here is your room: " + room1.getName());
        System.out.println("Here is your rooms description: " + room1.getDescription());

        room1.setExits("east", room2);

        System.out.println("Exits in room 1: " + room1.getExits());



    }

}