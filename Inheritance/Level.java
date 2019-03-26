
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public abstract class Level 
{
    private ArrayList<Item> roomItems = new ArrayList<Item>();
    private ArrayList<Item> enemies  = new ArrayList<Item>();
    public  Player play = new Player(500, 100, null, null);
    public Level(ArrayList <Item> roomItems, ArrayList<Item> enemies, Character player){
        this.roomItems = roomItems;
        this.enemies = enemies;
    }

}
