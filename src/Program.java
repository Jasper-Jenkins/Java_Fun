import Classes.Item;
import Classes.Room;

public class Program {
    public static void main (String[] args){
        System.out.println("Hello World");

        Item itemOne = new Item("Fire", "Hot as hades");

        System.out.println("Here is your item: " + itemOne.getName());
        System.out.println("Here is your items description: " + itemOne.getDescription());

        Room room1 = new Room("main", "Cool room for sure");

        System.out.println("Here is your room: " + room1.getName());
        System.out.println("Here is your rooms description: " + room1.getDescription());
    }
}