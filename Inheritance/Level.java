
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
    public Level(ArrayList <Item> roomItems, ArrayList<Item> enemies){
        this.roomItems = roomItems;
        this.enemies = enemies;
    }

}
